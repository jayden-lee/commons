plugins {
    kotlin("jvm") version "1.3.71"
    id("com.github.dcendents.android-maven") version "2.1"
}

group = "com.github.jayden-lee"
version = "0.0.2"

repositories {
    mavenCentral()
    maven { setUrl("https://jitpack.io") }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}