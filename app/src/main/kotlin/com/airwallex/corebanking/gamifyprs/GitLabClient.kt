package com.airwallex.corebanking.gamifyprs

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

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
}
