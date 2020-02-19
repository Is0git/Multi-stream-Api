package com.multistream.api.configs

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.factory.PasswordEncoderFactories
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer


@Configuration
class AuthorizationServerConfig : AuthorizationServerConfigurerAdapter() {


    @Bean
    fun passwordEncoder() = BCryptPasswordEncoder()

    @Autowired
    lateinit var passwordEncoder: BCryptPasswordEncoder



    override fun configure(clients: ClientDetailsServiceConfigurer?) {
        clients?.inMemory()
                ?.withClient("first-client")
                ?.secret(passwordEncoder.encode("noonewilleverguess"))
                ?.scopes("resource:read")
                ?.authorizedGrantTypes("authorization_code", "refresh_token")
                ?.redirectUris("http://localhost:8081/oauth/login/client-app")
                ?.refreshTokenValiditySeconds(120)
    }
}