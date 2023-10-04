package id.synth.rwls.dsl

import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

// https://github.com/gradle/gradle/issues/15383
internal val Project.libs: LibrariesForLibs
    get() = this.extensions.getByType()

