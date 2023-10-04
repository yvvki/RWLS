pluginManagement {
    includeBuild("build-logic")
}

plugins {
    // https://docs.gradle.org/current/userguide/toolchains.html#sec:provisioning
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}

rootProject.name = "RWLS"
include("app", "list", "utilities")
