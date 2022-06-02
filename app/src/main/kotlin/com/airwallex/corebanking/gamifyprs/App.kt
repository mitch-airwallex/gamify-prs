package com.airwallex.corebanking.gamifyprs

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties
class App

fun main(args: Array<String>) {
    SpringApplication.run(App::class.java, *args)
    println("The app is ALIVE!")
}
