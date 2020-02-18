package com.multistream.api.configs


import org.springframework.boot.autoconfigure.security.servlet.PathRequest

import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurer
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer
import java.security.Principal


@Configuration
class DatasourceConfig : WebSecurityConfigurerAdapter() {

    override fun configure(http: HttpSecurity?) {
//        http?.requestMatchers()
//                ?.antMatchers("/login", "/oauth/authorize")
//                ?.and()
//                ?.authorizeRequests()
//                ?.anyRequest()?.authenticated()
//                ?.and()
//                ?.formLogin()?.permitAll()
//                ?.and()
//                ?.antMatcher("/greeting")?.anonymous()

//        http
//                ?.csrf()?.disable()
//                ?.authorizeRequests()
//                ?.requestMatchers(PathRequest.toStaticResources().atCommonLocations())?.permitAll()
//                ?.antMatchers(HttpMethod.POST, "/login", "/register")?.permitAll()
//                ?.antMatchers("/api/**")?.authenticated()
//                ?.anyRequest()?.authenticated()
//                ?.and()
//                ?.httpBasic()
//                ?.and()
//                ?.sessionManagement()
//                ?.sessionCreationPolicy(SessionCreationPolicy.STATELESS)

    }


//    override fun configure(auth: AuthenticationManagerBuilder?) {
//        auth?.inMemoryAuthentication()
//                ?.withUser("sdsd")
//                ?.password("45645")
//                ?.roles("USER")
//
//    }



}