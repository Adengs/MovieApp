package com.example.ads.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.example.ads.connection.ApiServices
import com.example.ads.connection.MoviePagingSource
import retrofit2.http.Query
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieRepository @Inject constructor (private val movieApi : ApiServices){
    fun getNowPlayingMovies() =
        Pager(
            config = PagingConfig(
                pageSize = 10,
                enablePlaceholders = false
            ),
            pagingSourceFactory = {MoviePagingSource(movieApi, null)}
        ).liveData

    fun getGenre() {}
    fun getSearhMovie(query: String) =
        Pager(
            config = PagingConfig(
                pageSize = 10,
                enablePlaceholders = false
            ),
            pagingSourceFactory = {MoviePagingSource(movieApi, query)}
        ).liveData
}