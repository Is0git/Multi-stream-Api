package com.multistream.api.models

import org.intellij.lang.annotations.Identifier
import org.springframework.data.annotation.Id
import javax.persistence.Entity

@Entity
data class Greeting(@javax.persistence.Id val id: Long, val content: String)