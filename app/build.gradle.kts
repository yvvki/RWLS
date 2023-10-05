plugins {
    id("id.synth.rwls.application")
}

dependencies {
    implementation(libs.lsp4j)
    implementation(project(":server"))
}

application {
    mainClass.set("MainKt")
}
