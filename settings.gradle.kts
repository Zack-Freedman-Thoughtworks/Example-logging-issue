rootProject.name = "example-error"

pluginManagement {
    plugins {
        id("org.springframework.boot") version "3.2.3"
        id("io.spring.dependency-management") version "1.1.0"
        kotlin("jvm") version "1.8.22"
        kotlin("plugin.spring") version "1.8.22"
        kotlin("plugin.serialization") version "1.8.22"
    }
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}