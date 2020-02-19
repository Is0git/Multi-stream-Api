package com.multistream.api.configs

import org.apache.tomcat.util.net.openssl.ciphers.Authentication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.annotation.Order
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.oauth2.provider.token.TokenStore
import org.springframework.security.provisioning.InMemoryUserDetailsManager
@Configuration
@Order(1)
class WebAuthorizationConfig : WebSecurityConfigurerAdapter() {

    @Autowired
    lateinit var passwordEncoder: BCryptPasswordEncoder
    override fun configure(http: HttpSecurity?) {
       http
               ?.antMatcher("/**")
               ?.authorizeRequests()
               ?.antMatchers("/oauth/authorize**", "/login**", "/error**")
               ?.permitAll()
               ?.and()
               ?.authorizeRequests()
               ?.anyRequest()?.authenticated()
               ?.and()
               ?.formLogin()?.permitAll()
    }


    override fun configure(auth: AuthenticationManagerBuilder?) {
        auth?.inMemoryAuthentication()
                ?.withUser("SKYRIM")
                ?.password(passwordEncoder.encode("test123"))
                ?.roles("USER")

    }
}