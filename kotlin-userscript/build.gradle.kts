plugins {
    `kotlin-dsl`
    id("maven-publish")
    id("com.gradle.plugin-publish") version "2.0.0"
}

repositories {
    // Use Maven Central for resolving dependencies
    mavenCentral()
}

group = "dev.seized"
version = "0.1.0"

dependencies {
    // Use JUnit test framework for unit tests
    testImplementation("junit:junit:4.13")
}

gradlePlugin {
    plugins {
        register("kotlin-userscript-plugin") {
            id = "com.github.6x68.kotlin-userscript-plugin"
            displayName = "Kotlin Userscript"
            description = "Allows creating browser userscripts in Kotlin/JS."
            implementationClass = "dev.seized.userscript.KotlinUserscriptPlugin"
            tags = listOf("kotlin", "userscript", "tampermonkey", "greasemonkey")
        }
    }
    website = "https://github.com/6x68/kotlin-userscript-plugin"
    vcsUrl = "https://github.com/6x68/kotlin-userscript-plugin.git"
}
