package com.airwallex.corebanking.gamifyprs.gitlab

import com.airwallex.corebanking.gamifyprs.model.MergeRequest
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
    val accessToken: String
) {

    fun restTemplate(): RestTemplate = RestTemplateBuilder()
        .setConnectTimeout(Duration.ofSeconds(10))
        .build()

    fun getMergeRequests(): List<MergeRequest>? {
        val request = HttpEntity(createHeaders().toMap())
        val responseEntity = try {
            restTemplate().exchange(
                createUri(),
                HttpMethod.GET,
                request,
                Array<MergeRequest>::class.java,
                1
            )
        } catch (e: RestClientResponseException) {
            ResponseEntity.status(e.rawStatusCode).build()
        }

        return responseEntity.body?.asList()
    }

    private fun createHeaders(): HttpHeaders {
        val headers = HttpHeaders()
        headers.set("PRIVATE-TOKEN", accessToken)
        return headers
    }

    private fun createUri(): String {
        val uri = UriComponentsBuilder.fromHttpUrl("https://gitlab.awx.im/api/v4/projects/844/")
            .queryParam("scope", "all")
            .queryParam("state", "merged")
            .queryParam("approved_by_ids", "Any")
            .encode()
            .toUriString()

        println(uri)
        return uri
    }
}
