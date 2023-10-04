package id.synth.rwls

plugins {
    id("org.jetbrains.kotlin.jvm")
}

dependencies {
    constraints {
        implementation("org.apache.commons:commons-text:1.10.0")
    }
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter("5.9.3")
        }
    }
}
