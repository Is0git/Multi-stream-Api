package com.multistream.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration
import org.springframework.boot.runApplication


@SpringBootApplication(exclude = [ErrorMvcAutoConfiguration::class])
class MultiStreamApplication

fun main(args: Array<String>) {


    runApplication<MultiStreamApplication>(*args)


}
