@file:Suppress("UnstableApiUsage")

plugins {
    id("com.android.application")

}

android {
    namespace = "com.newpine.example"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.newpine.example"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true

    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.core)
    implementation(libs.material.v190)
    implementation(libs.constraintlayout)
    implementation(libs.pine.core)
}