package com.example.ads.connection

import com.example.ads.BuildConfig
import com.example.ads.model.GenreResponse
//import com.example.ads.model.MovieResponse
import com.example.ads.model.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {
    companion object{
        const val BASE_URL = BuildConfig.BASE_URL
        const val API_KEY = BuildConfig.MOVIEDB_API_KEY
        const val APP_TOKEN = BuildConfig.APP_TOKEN
    }
    @GET("movie/now_playing")
    suspend fun getNowPlayingMovies(
        @Query("page") position: Int,
    ): Response<MovieResponse>

    @GET("genre/movie/list")
    suspend fun getGenre(): Response<GenreResponse>

    @GET("search/movie")
    suspend fun searchMovie(
        @Query("query") query: String,
        @Query("page") page: Int,
    ): Response<MovieResponse>
}