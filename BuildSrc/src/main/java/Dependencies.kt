import sun.misc.Version

object Versions {

    // App version
    const val appVersionCode = 1
    const val appVersionName = "1.0.0"

    // Build Config
    const val compileSDK = 28
    const val appIdSDK = "com.example.ran.dependenciesmanagement"
    const val minSDK = 15
    const val targetSDK = 28

    // Plugins
    const val androidGradlePlugin = "3.1.4"

    // Kotlin
    const val kotlin = "1.2.51"

    // Support Lib
    const val support = "27.1.1"
    const val constraintLayout = "1.1.2"

    // Testing
    const val junit = "4.12"
    const val espresso = "3.0.2"
    const val testRunner = "1.0.2"

    //Live Data
    const val archLifeCycle = "1.1.0"
    const val archRoom = "1.0.0"

    //Rest API
    const val loggingInterceptor = "3.8.0"
    const val okHttp = "3.9.0"
    const val rxJava2Android = "2.0.1"
    const val retrofit = "2.3.0"

    //Utility
    const val stetho = "1.5.0"
    const val picasso = "2.5.2"
    const val calligraphy = "2.3.0"

    //Dagger
    const val dagger = "2.16"

    //Mockito
    const val mockito = "1.10.19"

    //multidex
    const val multidex = "1.0.3"

    //paging
    const val paging = "1.0.0"

    //material design
    const val materialAppcompat = "28.0.0-alpha3"

    //Readmore textview
    const val readMore = "2.1.0"

    //RoundedImage
    const val roundedImage = "2.3.0"

    //idling resources
    const val idlingRes = "3.0.2"

}

object Deps {
    // Support Library
    const val appCompat = "com.android.support:appcompat-v7:${Versions.support}"
    const val supportAnnotations = "com.android.support:support-annotations:${Versions.support}"
    const val constraintLayout = "com.android.support.constraint:constraint-layout:${Versions.constraintLayout}"
    const val recyclerView = "com.android.support:recyclerview-v7:${Versions.support}"
    const val design = "com.android.support:design:${Versions.materialAppcompat}"
    const val cardView = "com.android.support:cardview-v7:${Versions.support}"


    // Kotlin
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    //Room
    const val room = "android.arch.persistence.room:runtime:${Versions.archRoom}"
    const val roomCompiler = "android.arch.persistence.room:compiler:${Versions.archRoom}"

    //Lifecycle
    const val lifecycle = "android.arch.lifecycle:extensions:${Versions.archLifeCycle}"
    const val lifeCyclerCom = "android.arch.lifecycle:common-java8:${Versions.archLifeCycle}"

    //Rest Api
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val rxAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val logginInt = "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"

    //Reactivex
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxJava2Android}"
    const val stetho = "com.facebook.stetho:stetho:${Versions.stetho}"

    // Testing
    const val junit = "junit:junit:${Versions.junit}"
    const val espressoCore = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
    const val testRunner = "com.android.support.test:runner:${Versions.testRunner}"
    const val dataBinding = "com.android.databinding:compiler:${Versions.androidGradlePlugin}"

    const val picasso = "com.squareup.picasso:picasso:${Versions.picasso}"
    const val calligraphy = "uk.co.chrisjenx:calligraphy:${Versions.calligraphy}"
    const val mockito = "org.mockito:mockito-core:${Versions.mockito}"

    //Dagger component
    const val dagger_core = "com.google.dagger:dagger:${Versions.dagger}"
    const val dagger_android_core = "com.google.dagger:dagger-android:${Versions.dagger}"
    const val dagger_android_support = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    const val dagger_processor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    const val dagger_compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"

    // Plugins
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"

    //Multidex
    const val multidex = "com.android.support:multidex:${Versions.multidex}"

    //Paging
    const val paging = "android.arch.paging:runtime:${Versions.paging}"

    //Readmore
    const val readMore = "com.borjabravo:readmoretextview:${Versions.readMore}"

    //RoundedImage
    const val roundedImage = "com.makeramen:roundedimageview:${Versions.roundedImage}"

    const val idlingRes = "com.android.support.test.espresso:espresso-idling-resource:${Versions.idlingRes}"


}
