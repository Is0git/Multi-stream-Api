package com.multistream.api

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.factory.PasswordEncoderFactories
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurer
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer


@SpringBootApplication(exclude = [ErrorMvcAutoConfiguration::class])
@EnableAuthorizationServer
class MultiStreamApplication : AuthorizationServerConfigurer{
    @Value("security.oauth2.client-id")
    lateinit var clientId: String
    @Value("security.oauth2.client-secret")
    lateinit var secret: String


    override fun configure(security: AuthorizationServerSecurityConfigurer?) {
        security?.passwordEncoder(PasswordEncoderFactories.createDelegatingPasswordEncoder())
    }

    override fun configure(clients: ClientDetailsServiceConfigurer?) {
       clients?.inMemory()?.withClient("first-client")?.secret("noonewilleverguess")
    }

    override fun configure(endpoints: AuthorizationServerEndpointsConfigurer?) {

    }

    @Bean
    fun passwordEncoder() = BCryptPasswordEncoder()

}

fun main(args: Array<String>)  {


    runApplication<MultiStreamApplication>(*args)


}
