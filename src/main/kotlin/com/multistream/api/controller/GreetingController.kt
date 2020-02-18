package com.multistream.api.controller

import com.multistream.api.models.Greeting
import com.multistream.api.repositories.UserRepository
import org.springframework.web.bind.annotation.*

import java.util.concurrent.atomic.AtomicLong
import javax.validation.Valid

@RestController
class GreetingController(var userRepository: UserRepository) {


    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "id", defaultValue = "5") id: Long) = userRepository.findAll()

    @PostMapping("/addGreeting")
    fun addGreeting(@Valid @RequestBody greeting: Greeting) =  userRepository.save(greeting)
}