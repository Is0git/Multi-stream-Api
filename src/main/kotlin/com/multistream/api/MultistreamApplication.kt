package com.multistream.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MultiStreamApplication

fun main(args: Array<String>) {
	runApplication<MultiStreamApplication>(*args)
}
