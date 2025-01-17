package com.multistream.api.models


import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import org.intellij.lang.annotations.Identifier
import org.springframework.data.annotation.Id
import java.util.*
import javax.persistence.*

@Entity
data class Greeting(@javax.persistence.Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long = UUID.randomUUID().mostSignificantBits, val content: String, @OneToOne(cascade = [CascadeType.ALL]) @JoinColumn(name = "id", referencedColumnName = "id") @JsonIgnoreProperties("greeting")var user: User? = null) {


}