plugins {
    alias(libs.plugins.jetbrains.kotlin.jvm.plugins)
}

dependencies {
    compileOnly(libs.jetbrains.kotlin.compiler.embeddable)
}

