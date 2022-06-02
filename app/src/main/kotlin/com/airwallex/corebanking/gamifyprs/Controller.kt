package com.airwallex.corebanking.gamifyprs

import com.airwallex.corebanking.gamifyprs.gitlab.GitLabClient
import com.airwallex.corebanking.gamifyprs.model.MergeRequest
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/things")
class Controller(
    val gitLabClient: GitLabClient
) {

//    @GetMapping
//    fun getEverything(): ResponseEntity<List<Int>> = ResponseEntity.ok(listOf(5))

    @GetMapping
    fun getMRs(): ResponseEntity<List<MergeRequest>?> {
        val mergeRequests = gitLabClient.getMergeRequests()

        mergeRequests?.let {
            println("MRs NON-NULL: $mergeRequests")
        } ?: println("NULL MRs")

        return ResponseEntity.ok(mergeRequests)


    }
}
