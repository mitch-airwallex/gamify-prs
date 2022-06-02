package com.airwallex.corebanking.gamifyprs.gitlab

import com.airwallex.corebanking.gamifyprs.GITLAB_URL
import com.airwallex.corebanking.gamifyprs.PROJECT_ID
import com.airwallex.corebanking.gamifyprs.model.MergeRequest
import com.fasterxml.jackson.databind.JsonNode
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Component
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.client.RestClientResponseException
import org.springframework.web.client.RestTemplate
import org.springframework.web.util.UriComponentsBuilder
import java.time.Duration

@Component
class GitLabClient(
    @Value("\${application.accessToken}")
    val accessToken: String,
    val restTemplate: RestTemplate
) {

    fun getApprovals(mergedRequestId: String): List<User> {
        val headers = HttpHeaders()
        headers.set("PRIVATE-TOKEN", accessToken)

        val requestEntity = HttpEntity<Unit>(headers)

        return restTemplate.exchange(
            getApprovalsFullPath(mergedRequestId),
            HttpMethod.GET,
            requestEntity,
            GetApprovalsResponse::class.java
        ).body?.approved_by?.map { it.user } ?: listOf()
    }

    private fun getApprovalsFullPath(mergedRequestId: String) =
        "$GITLAB_URL/projects/$PROJECT_ID/merge_requests/$mergedRequestId/approvals"

    data class GetApprovalsResponse(
        val approved_by: List<Entity>
    )

    data class Entity(
        val user: User
    )

    data class User(
        val name: String,
        val username: String,
        val avatar_url: String,
        val id: Int
    )

    fun getMergeRequests(): List<MergeRequest> {
        val request = HttpEntity<Unit>(createHeaders())
        val responseEntity = try {
            restTemplate.exchange(
                createUri(),
                HttpMethod.GET,
                request,
                Array<MergeRequest>::class.java,
                1
            )
        } catch (e: RestClientResponseException) {
            ResponseEntity.status(e.rawStatusCode).build()
        }

        println(responseEntity)
        return responseEntity.body?.toList() ?: emptyList()
    }

    private fun createHeaders(): HttpHeaders {
        val headers = HttpHeaders()
        headers.set("PRIVATE-TOKEN", accessToken)
        return headers
    }

    private fun createUri(): String {
        val uri = UriComponentsBuilder.fromHttpUrl("https://gitlab.awx.im/api/v4/projects/844/merge_requests/")
            .queryParam("scope", "all")
            .queryParam("state", "merged")
            .queryParam("approved_by_ids", "Any")
            .encode()
            .toUriString()

        println(uri)
        return uri
    }

    data class GetMergeRequestsResponse(
        val mergedRequests: List<MergeRequest>
    )
}
