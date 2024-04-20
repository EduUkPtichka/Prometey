import org.jetbrains.kotlin.gradle.dsl.ExplicitApiMode.Strict
import org.jetbrains.kotlin.gradle.dsl.ExplicitApiMode.Warning

plugins {
    alias(libs.plugins.jetbrains.kotlin.multiplatform.plugins)
}

kotlin {

    // Explicit API Mode
    // https://github.com/Kotlin/KEEP/blob/master/proposals/explicit-api-mode.md

    explicitApi()
    explicitApiWarning()

    explicitApi = Strict
    explicitApi = Warning


    jvm()
}
