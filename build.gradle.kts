import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot")
	id("io.spring.dependency-management")
	kotlin("jvm")
	kotlin("plugin.spring")
}

java.sourceCompatibility = JavaVersion.VERSION_17
java.targetCompatibility = JavaVersion.VERSION_17

// Removing this block and `spring-boot-starter-log4j2` fixes the issue
configurations {
	all {
		exclude(
			group = "org.springframework.boot",
			module = "spring-boot-starter-logging",
		)
	}
}

repositories {
	mavenCentral()
}


dependencies {
	implementation("org.springframework.boot:spring-boot-starter-log4j2")
	implementation("io.github.oshai:kotlin-logging-jvm:6.0.3")

	implementation("org.springframework.boot:spring-boot-starter-actuator")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf(
			"-Xjsr305=strict",
			"-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
		)
		jvmTarget = "17"
	}
}
