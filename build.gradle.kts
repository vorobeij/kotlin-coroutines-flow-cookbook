plugins {
    java
    kotlin("jvm") version "1.7.10"
    id("io.gitlab.arturbosch.detekt").version("1.21.0")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val javaVersion = JavaVersion.VERSION_17

apply(plugin = "io.gitlab.arturbosch.detekt")

configurations.all {
    resolutionStrategy.cacheChangingModulesFor(0, "seconds")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("io.reactivex.rxjava3:rxjava:3.1.5")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    testImplementation("junit", "junit", "4.12")
    testImplementation("com.google.truth:truth:1.1.3")
}
