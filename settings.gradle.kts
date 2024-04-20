rootProject.name = "Prometey"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }

}

// Api
include(":prometey-api")

// Общий для Compiler plugin и Compiler plugin backend
include(":prometey-compiler-shared")

include(":prometey-compiler-plugin")
