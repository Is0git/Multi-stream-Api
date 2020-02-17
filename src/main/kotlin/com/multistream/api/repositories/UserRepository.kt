package com.multistream.api.repositories

import com.multistream.api.models.Greeting
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<Greeting, Long> {
}