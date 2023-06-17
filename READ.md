    // Dagger2 用於依賴注入
    implementation 'com.google.dagger:dagger:2.46.1'
    kapt 'com.google.dagger:dagger-compiler:2.46.1'

    // Retrofit2 用於處理網路請求
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    // Gson Converter 用於將JSON轉換成Java/Kotlin對象
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'

    // OkHttp Logging Interceptor 用於在開發過程中記錄所有網路請求和回應
    implementation 'com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.6'

    // Glide用於圖片加載和緩存
    implementation 'com.github.bumptech.glide:glide:4.15.1'
    kapt 'com.github.bumptech.glide:compiler:4.15.1'

    def lifecycle_version = "2.6.1"

    // ViewModel 和 LiveData 用於實現MVVM架構
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
    implementation "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version"

    // Compose ViewModel utilities 為Compose提供ViewModel工具
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycle_version")
    // Saved state module 用於ViewModel狀態保存
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycle_version")
    // 使用Java 8 API的Lifecycle類別
    implementation "androidx.lifecycle:lifecycle-common-java8:$lifecycle_version"

    // Room 為SQLite提供抽象層，方便數據庫操作
    implementation("androidx.room:room-runtime:2.6.0-alpha01")
    kapt("androidx.room:room-compiler:2.6.0-alpha01")
    // Kotlin Coroutines support for Room
    implementation("androidx.room:room-ktx:2.6.0-alpha01")

    // Kotlin Coroutines 核心庫，為異步操作提供支援
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")

