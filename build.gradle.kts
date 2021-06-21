/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/7.0.2/samples
 */


plugins {
    kotlin("jvm") version "1.5.10"
}

repositories {
    mavenCentral()
}

//sourceSets.main {
//    java.srcDirs("src")
//
//}


dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.4.2")
    testImplementation(platform("org.junit:junit-bom:5.7.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}