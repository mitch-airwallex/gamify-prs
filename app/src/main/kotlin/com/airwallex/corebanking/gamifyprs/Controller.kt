package com.airwallex.corebanking.gamifyprs

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/things")
class Controller(val gitLabClient: GitLabClient) {

    @GetMapping
    fun getEverything(): ResponseEntity<List<GitLabClient.User>> =
        gitLabClient.getMergedRequests()
            .flatMap { gitLabClient.getApprovals(it.mergeRequestId) }
            .let { ResponseEntity.ok(it) }
}
