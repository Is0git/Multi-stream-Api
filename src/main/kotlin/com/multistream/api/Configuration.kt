package com.multistream.api

import com.multistream.api.models.Greeting
import com.multistream.api.models.User
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource


@Configuration
class DatasourceConfig {
    @Bean
    fun greeting() : Greeting {
    return    Greeting(1, "sdsd")
    }

    @Bean
    fun user() : User = User(0, "name,", "SOS")
}