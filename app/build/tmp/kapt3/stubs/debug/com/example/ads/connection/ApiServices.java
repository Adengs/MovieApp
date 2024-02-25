package com.example.ads.connection;

import com.example.ads.BuildConfig;
import com.example.ads.model.GenreResponse;
import com.example.ads.model.MovieResponse;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/ads/connection/ApiServices;", "", "getGenre", "Lretrofit2/Response;", "Lcom/example/ads/model/GenreResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNowPlayingMovies", "Lcom/example/ads/model/MovieResponse;", "position", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchMovie", "query", "", "page", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface ApiServices {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BASE_URL = "https://api.themoviedb.org/3/";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String API_KEY = "2e17889eb1cbfcc42b2542abdc38769f";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String APP_TOKEN = "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIyZTE3ODg5ZWIxY2JmY2M0MmIyNTQyYWJkYzM4NzY5ZiIsInN1YiI6IjY1ZDk5ODA3OTNiZDY5MDE2MjhiNmI0ZCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.Mns-3NSh9cBV5-1s2uJnfIau7I-jq8mFd9EfU14_lIw";
    @org.jetbrains.annotations.NotNull
    public static final com.example.ads.connection.ApiServices.Companion Companion = null;
    
    @retrofit2.http.GET(value = "movie/now_playing")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getNowPlayingMovies(@retrofit2.http.Query(value = "page")
    int position, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.ads.model.MovieResponse>> $completion);
    
    @retrofit2.http.GET(value = "genre/movie/list")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getGenre(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.ads.model.GenreResponse>> $completion);
    
    @retrofit2.http.GET(value = "search/movie")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object searchMovie(@retrofit2.http.Query(value = "query")
    @org.jetbrains.annotations.NotNull
    java.lang.String query, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.ads.model.MovieResponse>> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/ads/connection/ApiServices$Companion;", "", "()V", "API_KEY", "", "APP_TOKEN", "BASE_URL", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String BASE_URL = "https://api.themoviedb.org/3/";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String API_KEY = "2e17889eb1cbfcc42b2542abdc38769f";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String APP_TOKEN = "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIyZTE3ODg5ZWIxY2JmY2M0MmIyNTQyYWJkYzM4NzY5ZiIsInN1YiI6IjY1ZDk5ODA3OTNiZDY5MDE2MjhiNmI0ZCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.Mns-3NSh9cBV5-1s2uJnfIau7I-jq8mFd9EfU14_lIw";
        
        private Companion() {
            super();
        }
    }
}