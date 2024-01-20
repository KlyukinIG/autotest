plugins {
    id("java-library")
    id("io.qameta.allure") version "2.11.2"
}

group = "org.gradelproject"
version = "1.0-SNAPSHOT"


allure {
    report {
        version.set("2.25.0")
    }
    adapter { // build/allure-results
        aspectjWeaver.set(true) //@Step
        frameworks {
            junit5 { //
                adapterVersion.set("2.25.0")
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
    testImplementation("com.codeborne:selenide:7.0.4")
    testImplementation("org.assertj:assertj-core:3.25.1")
    testImplementation("io.cucumber:cucumber-junit:7.2.3")
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")
    testImplementation("io.qameta.allure:allure-selenide:2.25.0")
    testImplementation("com.github.javafaker:javafaker:1.0.2")
    runtimeOnly("org.aspectj:aspectjweaver:1.9.21")
    testRuntimeOnly("org.slf4j:slf4j-simple:2.0.11")
}



tasks.register("cleanAllureResults") {
    doLast {
        delete("build/allure-results")
    }
}

tasks.test {
    useJUnitPlatform {
    }
    dependsOn("cleanAllureResults")
}