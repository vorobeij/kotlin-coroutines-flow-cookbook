plugins {
    java
    kotlin("jvm")
    id("io.gitlab.arturbosch.detekt")
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
    implementation(ReactiveX.rxJava3)
    implementation(KotlinX.coroutines.core)
    testImplementation("junit", "junit", "4.12")
    testImplementation("com.google.truth:truth:_")
}
