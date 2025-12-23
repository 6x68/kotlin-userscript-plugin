plugins {
    `kotlin-dsl`
    id("maven-publish")
    id("com.gradle.plugin-publish") version "2.0.0"
}

repositories {
    // Use Maven Central for resolving dependencies
    mavenCentral()
}

group = "it.krzeminski"
version = "0.3.0"

dependencies {
    // Use JUnit test framework for unit tests
    testImplementation("junit:junit:4.13")
}

gradlePlugin {
    plugins {
        register("kotlin-userscript-plugin") {
            id = "it.krzeminski.kotlin-userscript"
            displayName = "Kotlin Userscript"
            description = "Allows creating browser userscripts in Kotlin/JS."
            implementationClass = "it.krzeminski.gradleplugins.kotlinuserscript.KotlinUserscriptPlugin"
            tags = listOf("kotlin", "userscript", "tampermonkey", "greasemonkey")
        }
    }
    website = "https://github.com/6x68/kotlin-userscript-plugin"
    vcsUrl = "https://github.com/6x68/kotlin-userscript-plugin.git"
}
