plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
    id("dagger.hilt.android.plugin")
    id("kotlin-parcelize")
}

android {
    namespace = "com.example.ads"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.ads"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        buildConfigField("String", "BASE_URL", "\"https://api.themoviedb.org/3/\"")
        buildConfigField("String", "MOVIEDB_API_KEY", "\"2e17889eb1cbfcc42b2542abdc38769f\"")
        buildConfigField("String", "APP_TOKEN", "\"eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIyZTE3ODg5ZWIxY2JmY2M0MmIyNTQyYWJkYzM4NzY5ZiIsInN1YiI6IjY1ZDk5ODA3OTNiZDY5MDE2MjhiNmI0ZCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.Mns-3NSh9cBV5-1s2uJnfIau7I-jq8mFd9EfU14_lIw\"")
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

    buildFeatures {
        dataBinding = true
        viewBinding = true
        buildConfig = true
    }
}

kapt {
    correctErrorTypes = true
}


dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-auth:22.3.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("com.intuit.sdp:sdp-android:1.1.0")
    implementation("com.squareup.picasso:picasso:2.71828")
    implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation ("androidx.activity:activity-ktx:1.8.2")

    //connect api
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:4.9.3")
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.0")
    implementation("com.google.code.gson:gson:2.9.1")

    //lifecycle
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")

    //dagger hilt
    implementation("com.google.dagger:hilt-android:2.48")
    kapt("com.google.dagger:hilt-android-compiler:2.48")
//    implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")
//    kapt("androidx.hilt:hilt-compiler:1.2.0")
//    def hilt = "2.45"
//    implementation("com.google.dagger:hilt-android:$hilt")
//    kapt ("com.google.dagger:hilt-android-compiler:$hilt")

    //paging 3
    implementation("androidx.paging:paging-runtime:3.2.1")
    implementation("androidx.paging:paging-runtime-ktx:3.2.1")

    //location
    implementation("com.google.android.gms:play-services-location:21.0.1")

    //youtube player
    implementation("com.pierfrancescosoffritti.androidyoutubeplayer:core:12.1.0")
}