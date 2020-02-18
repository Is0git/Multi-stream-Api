package com.multistream.api.repositories

import com.multistream.api.models.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
}