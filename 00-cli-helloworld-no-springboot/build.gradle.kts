import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.31"
    application
}

group = "me.msksgm"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("demo.DemoApplicationKt")
}