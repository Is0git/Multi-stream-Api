package com.multistream.api.controller

import com.multistream.api.models.User
import com.multistream.api.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@Controller
class AuthController {

    @Autowired
    lateinit var authenticationBuilder: AuthenticationManagerBuilder

    @Autowired
    lateinit var userRepository: UserRepository

    @PostMapping("/register")
    fun registerUser(@RequestBody user: User) {
        userRepository.save(user)
    }
}