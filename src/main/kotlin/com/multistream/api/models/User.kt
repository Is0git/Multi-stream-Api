package com.multistream.api.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToOne

@Entity
data class User(@Id @Column(unique = true) val id: Long, val userName: String, val password: String, @OneToOne(mappedBy = "user")  @JsonIgnoreProperties("user") var greeting: Greeting? = null) {
}