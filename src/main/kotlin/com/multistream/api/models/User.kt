package com.multistream.api.models

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class User(@Id val id: Long, val userName: String, val password: String) {
}