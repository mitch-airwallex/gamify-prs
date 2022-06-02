
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    idea
    `java-library`

    kotlin("jvm") version Config.Versions.KOTLIN
    kotlin("plugin.spring") version Config.Versions.KOTLIN apply false
    kotlin("plugin.noarg") version Config.Versions.KOTLIN apply false

    id("org.springframework.boot") version Config.Versions.SPRING_BOOT apply false
    id("io.spring.dependency-management") version Config.Versions.DEPENDENCY_MANAGEMENT apply false
}
apply(plugin = "io.spring.dependency-management")

allprojects {
    repositories {
        mavenCentral()
        mavenLocal()
    }
}

java.sourceCompatibility = JavaVersion.VERSION_11
java.targetCompatibility = JavaVersion.VERSION_11


subprojects {

    apply(plugin = "java-library")

    apply(plugin = "kotlin")
    apply(plugin = "org.jetbrains.kotlin.plugin.spring")
    apply(plugin = "io.spring.dependency-management")

    tasks.withType<Test> {
        useJUnitPlatform()
    }

    tasks.withType(KotlinCompile::class.java).all {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }

    dependencies {
        implementation(kotlin("stdlib"))
        implementation(kotlin("stdlib-jdk8"))
        implementation(kotlin("reflect"))

        testImplementation(Config.TestLibs.ASSERTJ)
        testImplementation(Config.TestLibs.JUNIT_API)
        testImplementation(Config.TestLibs.JUNIT_PARAMS)
        testRuntimeOnly(Config.TestLibs.JUNIT_ENGINE)
        testImplementation(Config.TestLibs.MOCKK)
        testImplementation(Config.TestLibs.MOCKITO_ALL)
        testImplementation(Config.TestLibs.MOCKITO_ALL_JUNIT_JUPITER)
        testImplementation(Config.TestLibs.MOCKITO_KOTLIN)
    }
}
