package com.multistream.api.controller

import com.multistream.api.models.Greeting
import com.multistream.api.models.User
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.*
import java.util.concurrent.atomic.AtomicLong
import javax.validation.Valid

@RestController
class UserController {
    val counter = AtomicLong()
    @GetMapping("/user")
    fun user(@RequestParam(value = "name", defaultValue = "World") name: String) = Greeting(counter.incrementAndGet(), "Hello, $name ")

    @PostMapping("/user/{id}")

    fun postUser(user: User) = Greeting(counter.incrementAndGet(), "Hello, ")

    @GetMapping("/")
    fun blog(model: Model)  = "FCJ"

}