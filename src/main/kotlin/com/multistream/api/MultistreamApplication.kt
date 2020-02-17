package com.multistream.api

import com.multistream.api.controller.GreetingController
import com.multistream.api.models.Greeting
import com.multistream.api.repositories.UserRepository
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration
import org.springframework.boot.runApplication
import java.lang.reflect.Method


@SpringBootApplication(exclude = [ErrorMvcAutoConfiguration::class])
class MultiStreamApplication

fun main(args: Array<String>) {


    runApplication<MultiStreamApplication>(*args)


}
