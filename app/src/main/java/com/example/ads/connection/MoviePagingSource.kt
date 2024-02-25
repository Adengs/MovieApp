package com.example.ads.connection

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.ads.model.Movie
//import com.example.ads.model.Movie
import retrofit2.HttpException
import retrofit2.http.Query
import java.io.IOException

private const val STARTING_PAGE_INDEX = 1

class MoviePagingSource (
    private val movieApi : ApiServices,
    private val query: String?,
) : PagingSource<Int, Movie>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Movie> {
        return try {
            val position = params.key ?: STARTING_PAGE_INDEX
            val response = if (query != null) movieApi.searchMovie(query,position) else movieApi.getNowPlayingMovies(position)
            val movies = response.body()?.results!!

            LoadResult.Page(
                data = movies,
                prevKey = if (position == STARTING_PAGE_INDEX) null else position-1,
                nextKey = if (movies.isEmpty()) null else position+1,
            )
        } catch (e : IOException){
            LoadResult.Error(e)
        } catch (e : HttpException){
            LoadResult.Error(e)
        }
        }

    override fun getRefreshKey(state: PagingState<Int, Movie>): Int? {
//        return state.anchorPosition?.let { anchorPosition ->
//            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
//                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
//        }
        return state.anchorPosition?.let {
            state.closestPageToPosition(it)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(it)?.nextKey?.minus(1)
        }
    }
}