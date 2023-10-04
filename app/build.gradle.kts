plugins {
    id("id.synth.rwls.application")
}

dependencies {
    implementation(libs.apache.commons.text)
    implementation(project(":utilities"))
}

application {
    mainClass.set("MainKt")
}
