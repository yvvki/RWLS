package id.synth.rwls

import id.synth.rwls.dsl.libs

plugins {
    id("org.jetbrains.kotlin.jvm")
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter(libs.versions.junit.jupiter)
        }
    }
}
