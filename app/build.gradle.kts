plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "dev.sindrenm.repros.testfixtureswithcontextreceivers"
    compileSdk = 34

    defaultConfig {
        applicationId = "dev.sindrenm.repros.testfixtureswithcontextreceivers"

        minSdk = 24
        targetSdk = 35

        versionCode = 1
        versionName = "1.0.0"
    }

    kotlin {
        jvmToolchain {
            languageVersion = JavaLanguageVersion.of(17)
        }

        compilerOptions {
            freeCompilerArgs.add("-Xcontext-receivers")
        }
    }

    @Suppress("UnstableApiUsage")
    testFixtures.enable = true
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
}