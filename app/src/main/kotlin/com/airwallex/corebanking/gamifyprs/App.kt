package com.airwallex.corebanking.gamifyprs

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.web.client.RestTemplate

const val GITLAB_URL = "https://gitlab.awx.im/api/v4"
const val PROJECT_ID = "844"

@SpringBootApplication
@EnableScheduling
class App {
    @Bean
    fun restTemplate() = RestTemplate()

    @Bean
    fun objectMapper() = jacksonObjectMapper()
}

fun main(args: Array<String>) {
    SpringApplication.run(App::class.java, *args)
    println("The app is ALIVE!")
}
