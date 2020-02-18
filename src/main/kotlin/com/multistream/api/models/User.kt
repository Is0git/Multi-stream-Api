package com.multistream.api.models

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToOne

@Entity
data class User(@Id val id: Long, val userName: String, val password: String, @OneToOne(mappedBy = "user") var greeting: Greeting? = null) {
}