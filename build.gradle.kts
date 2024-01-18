plugins {
    id("java-library")
    id("io.qameta.allure") version "2.11.2"
}

group = "org.gradelproject"
version = "1.0-SNAPSHOT"

allure {
    report {
        version.set("2.19.0")
    }
    adapter {
        aspectjWeaver.set(true)
        frameworks {
            junit5 {
                adapterVersion.set("2.19.0")
            }
        }
    }
}

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
    testImplementation ("io.qameta.allure:allure-selenide:2.25.0")
}


tasks.test {
    useJUnitPlatform()
}

tasks.register<Test>("runTestImgbb") {
    useJUnitPlatform {
        includeTags("imgbb")
    }
}

tasks.register("cleanAllureResults") {
    doLast {
        delete("build/allure-results")
    }
}
