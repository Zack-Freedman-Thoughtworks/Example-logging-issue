package com.example.logging.exampleerror

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExampleErrorApplication : CommandLineRunner {
	private val logger = KotlinLogging.logger {}
	override fun run(vararg args: String?) {
		logger.atInfo {
			message = "Hey this fails {}"
			payload = mapOf(
				"first" to "second"
			)
		}

		logger.atInfo {
			message = "Hey this doesn't fail {}"
		}
	}

}

fun main(args: Array<String>) {
	runApplication<ExampleErrorApplication>(*args)
}
