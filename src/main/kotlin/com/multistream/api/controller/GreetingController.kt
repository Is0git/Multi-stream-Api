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
    fun greeting(@RequestParam(value = "id", defaultValue = "5") id: Long) = userRepository.findById(1)

    @GetMapping("/user")
    fun user(@RequestParam(value = "id", defaultValue = "5") id: Long) = userRepository.findById(1)

    @PostMapping("/addGreeting")
    fun addGreeting(@Valid @RequestBody greeting: Greeting) =  userRepository.save(greeting)
}