package com.example.ads.di

import android.app.Application
import com.example.ads.connection.ApiServices
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
//@InstallIn(Application::class)
object AppModule {
    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        val gson = GsonBuilder()
            .setLenient()
            .create()

        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        val header : Interceptor = LoginInterceptor()

        val client : OkHttpClient = OkHttpClient.Builder()
            .addInterceptor(header)
            .addInterceptor(interceptor)
            .connectTimeout(40, TimeUnit.SECONDS)
            .readTimeout(40, TimeUnit.SECONDS)
            .writeTimeout(40, TimeUnit.SECONDS)
            .build()

        return Retrofit.Builder()
            .baseUrl(ApiServices.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(client)
            .build()
    }


    @Provides
    @Singleton
    fun provideMovie(retrofit: Retrofit): ApiServices =
        retrofit.create(ApiServices::class.java)

    class LoginInterceptor () : Interceptor {
        override fun intercept(chain: Interceptor.Chain): Response = chain.run {
            proceed(
                request()
                    .newBuilder()
                    .addHeader("accept", "application/json")
                    .addHeader("Authorization", "Bearer ${ApiServices.APP_TOKEN}")
                    .build()
            )
        }
    }
}