package com.airwallex.corebanking.gamifyprs

import com.airwallex.corebanking.gamifyprs.gitlab.GitLabClient
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/things")
class Controller(val gitLabClient: GitLabClient) {

    @GetMapping
    fun getEverything(): ResponseEntity<List<UserWithScore>> =
        gitLabClient.getMergeRequests()
            .flatMap { gitLabClient.getApprovals(it.iid) }
            .groupBy { it.id }
            .toMap()
            .mapValues { UserWithScore(it.value.first(), it.value.size) }
            .values
            .sortedByDescending { it.score }
            .let { ResponseEntity.ok(it) }

    data class UserWithScore(
        val user: GitLabClient.User,
        val score: Int
    )
}
