package com.multistream.api.controller

import com.multistream.api.models.Greeting
import com.multistream.api.repositories.GreetingRepository
import com.multistream.api.repositories.UserRepository
import org.springframework.web.bind.annotation.*

import java.util.concurrent.atomic.AtomicLong
import javax.validation.Valid

@RestController
class GreetingController(var greetingRepository: GreetingRepository, val userRepository: UserRepository) {


    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "id", defaultValue = "5") id: Long) = greetingRepository.findById(1)

    @GetMapping("/user/{id}")
    fun user(@RequestParam(value = "id", defaultValue = "5") id: Long, @PathVariable("id") path: Long) = userRepository.findById(path)

    @PostMapping("/addGreeting")
    fun addGreeting(@Valid @RequestBody greeting: Greeting) =  greetingRepository.save(greeting)
}