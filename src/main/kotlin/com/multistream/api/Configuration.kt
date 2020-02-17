package com.multistream.api

import com.multistream.api.models.Greeting
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
}