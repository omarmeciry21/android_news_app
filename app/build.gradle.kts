plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.news_app"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.news_app"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures{
        viewBinding = true
    }
}
dependencies {
    // Core KTX
    implementation("androidx.core:core-ktx:1.15.0") // :contentReference[oaicite:0]{index=0}

    // AppCompat
    implementation("androidx.appcompat:appcompat:1.7.0") // :contentReference[oaicite:1]{index=1}

    // Material Design
    implementation("com.google.android.material:material:1.12.0") // :contentReference[oaicite:2]{index=2}

    // ConstraintLayout
    implementation("androidx.constraintlayout:constraintlayout:2.2.0") // :contentReference[oaicite:3]{index=3}

    // JUnit
    testImplementation("junit:junit:4.13.2") // :contentReference[oaicite:4]{index=4}

    // AndroidX Test - JUnit
    androidTestImplementation("androidx.test.ext:junit:1.2.1") // :contentReference[oaicite:5]{index=5}

    // AndroidX Test - Espresso
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1") // :contentReference[oaicite:6]{index=6}

    // Lifecycle ViewModel KTX
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.7") // :contentReference[oaicite:7]{index=7}

    // Room components
    implementation( "androidx.room:room-runtime:2.6.1")
    implementation ("androidx.room:room-ktx:2.6.1")
    kapt ("androidx.room:room-compiler:2.6.1")
    implementation ("androidx.room:room-testing:2.6.1")

    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3") // :contentReference[oaicite:11]{index=11}
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3") // :contentReference[oaicite:12]{index=12}

    // Lifecycle Runtime KTX
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1") // :contentReference[oaicite:13]{index=13}

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0") // :contentReference[oaicite:14]{index=14}
    implementation("com.squareup.retrofit2:converter-gson:2.9.0") // :contentReference[oaicite:15]{index=15}
    implementation("com.squareup.okhttp3:logging-interceptor:4.11.0") // :contentReference[oaicite:16]{index=16}

    // Navigation Components
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.3") // :contentReference[oaicite:17]{index=17}
    implementation("androidx.navigation:navigation-ui-ktx:2.7.3") // :contentReference[oaicite:18]{index=18}

    // Glide
    implementation("com.github.bumptech.glide:glide:4.15.1") // :contentReference[oaicite:19]{index=19}
    kapt("com.github.bumptech.glide:compiler:4.15.1") // :contentReference[oaicite:20]{index=20}

}
