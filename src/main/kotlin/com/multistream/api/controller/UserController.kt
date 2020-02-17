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

    @GetMapping("/")
    fun blog(model: Model)  = "FCJ"

}