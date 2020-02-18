package com.multistream.api

import com.multistream.api.models.Greeting
import org.springframework.boot.autoconfigure.security.servlet.PathRequest
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.core.userdetails.User
import org.springframework.security.provisioning.InMemoryUserDetailsManager
import javax.sql.DataSource


@Configuration
class DatasourceConfig : WebSecurityConfigurerAdapter() {
    override fun configure(http: HttpSecurity?) {
        http
                ?.csrf()?.disable()
                ?.authorizeRequests()
                ?.requestMatchers(PathRequest.toStaticResources().atCommonLocations())?.permitAll()
                ?.antMatchers(HttpMethod.POST, "/login", "/register")?.permitAll()
                ?.antMatchers("/")?.authenticated()
                ?.anyRequest()?.authenticated()
                ?.and()
                ?.httpBasic()
                ?.and()
                ?.sessionManagement()
                ?.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
    }

//    @Bean
//    fun userDeatailsService()  = run {
//
//        val user = User.withDefaultPasswordEncoder().username("user").password("password").roles("USER").build()
//        InMemoryUserDetailsManager(user)
//    }

    fun configureGlobal(auth: AuthenticationManagerBuilder) {
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("admin")
                .roles("ADMIN")
    }




}