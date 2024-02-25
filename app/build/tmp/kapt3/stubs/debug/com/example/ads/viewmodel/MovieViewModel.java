package com.example.ads.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.example.ads.connection.RequestState;
import com.example.ads.repositories.MovieRepository;
import dagger.assisted.Assisted;
import dagger.hilt.android.lifecycle.HiltViewModel;
import retrofit2.HttpException;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\tR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\n\u001a\u00020\u000b\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/ads/viewmodel/MovieViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/ads/repositories/MovieRepository;", "state", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/example/ads/repositories/MovieRepository;Landroidx/lifecycle/SavedStateHandle;)V", "currentQuery", "Landroidx/lifecycle/MutableLiveData;", "", "genre", "", "getGenre", "()Lkotlin/Unit;", "Lkotlin/Unit;", "movies", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Lcom/example/ads/model/Movie;", "getMovies", "()Landroidx/lifecycle/LiveData;", "searchMovies", "query", "Companion", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MovieViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.ads.repositories.MovieRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.SavedStateHandle state = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CURRENT_QUERY = "current_query";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String EMPTY_QUERY = "";
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> currentQuery = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.example.ads.model.Movie>> movies = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Unit genre = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.ads.viewmodel.MovieViewModel.Companion Companion = null;
    
    @javax.inject.Inject
    public MovieViewModel(@org.jetbrains.annotations.NotNull
    com.example.ads.repositories.MovieRepository repository, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle state) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.example.ads.model.Movie>> getMovies() {
        return null;
    }
    
    public final void searchMovies(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.Unit getGenre() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/ads/viewmodel/MovieViewModel$Companion;", "", "()V", "CURRENT_QUERY", "", "EMPTY_QUERY", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}