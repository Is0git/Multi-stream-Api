package com.multistream.api

import com.multistream.api.models.Greeting
import org.springframework.boot.autoconfigure.security.servlet.PathRequest
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.core.userdetails.User
import org.springframework.security.provisioning.InMemoryUserDetailsManager
import javax.sql.DataSource


@Configuration
class DatasourceConfig : WebSecurityConfigurerAdapter() {
    override fun configure(http: HttpSecurity?) {
        http
                ?.authorizeRequests()?.antMatchers("/", "/greeting")?.permitAll()
                ?.anyRequest()?.authenticated()
                ?.and()
                ?.formLogin()
                ?.loginPage("/login")?.permitAll()?.and()?.logout()?.permitAll()
    }

    @Bean
    fun userDeatailsService()  = run {

        val user = User.withDefaultPasswordEncoder().username("user").password("password").roles("USER").build()
        InMemoryUserDetailsManager(user)
    }




}