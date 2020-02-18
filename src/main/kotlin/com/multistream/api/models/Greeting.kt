package com.multistream.api.models


import org.intellij.lang.annotations.Identifier
import org.springframework.data.annotation.Id
import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.OneToMany
import javax.persistence.OneToOne

@Entity
data class Greeting(@javax.persistence.Id val id: Long, val content: String, @OneToOne(cascade = [CascadeType.ALL]) var user: User? = null)