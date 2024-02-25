package com.example.ads.repositories;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import com.example.ads.connection.ApiServices;
import com.example.ads.connection.MoviePagingSource;
import retrofit2.http.Query;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/ads/repositories/MovieRepository;", "", "movieApi", "Lcom/example/ads/connection/ApiServices;", "(Lcom/example/ads/connection/ApiServices;)V", "getGenre", "", "getNowPlayingMovies", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Lcom/example/ads/model/Movie;", "getSearhMovie", "query", "", "app_debug"})
public final class MovieRepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.ads.connection.ApiServices movieApi = null;
    
    @javax.inject.Inject
    public MovieRepository(@org.jetbrains.annotations.NotNull
    com.example.ads.connection.ApiServices movieApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.example.ads.model.Movie>> getNowPlayingMovies() {
        return null;
    }
    
    public final void getGenre() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.example.ads.model.Movie>> getSearhMovie(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
        return null;
    }
}