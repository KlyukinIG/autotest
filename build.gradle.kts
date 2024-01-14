plugins {
    id("java-library")
}

group = "org.gradelproject"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}


dependencies {
    testImplementation ("com.codeborne:selenide:7.0.4")
    testImplementation ("org.assertj:assertj-core:3.25.1")
    testImplementation ("io.cucumber:cucumber-junit:7.2.3")
    testImplementation ("org.junit.jupiter:junit-jupiter:5.9.3")
}


tasks.test {
    useJUnitPlatform()
}