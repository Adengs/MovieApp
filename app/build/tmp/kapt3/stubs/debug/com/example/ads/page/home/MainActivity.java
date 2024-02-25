package com.example.ads.page.home;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView.OnEditorActionListener;
import androidx.appcompat.app.AppCompatActivity;
import androidx.paging.LoadState;
import androidx.recyclerview.widget.GridLayoutManager;
import com.example.ads.adapter.GenreAdapter;
import com.example.ads.adapter.MovieAdapter;
import com.example.ads.connection.MovieLoadStateAdapter;
import com.example.ads.databinding.ActivityMainBinding;
import com.example.ads.model.Movie;
import com.example.ads.viewmodel.MovieViewModel;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0012\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0014\u0010\r\u00a8\u0006 "}, d2 = {"Lcom/example/ads/page/home/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/ads/adapter/MovieAdapter$OnItemClickListener;", "()V", "binding", "Lcom/example/ads/databinding/ActivityMainBinding;", "genreAdapter", "Lcom/example/ads/adapter/GenreAdapter;", "movieadapter", "Lcom/example/ads/adapter/MovieAdapter;", "viewModel", "Lcom/example/ads/viewmodel/MovieViewModel;", "getViewModel", "()Lcom/example/ads/viewmodel/MovieViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelGenre", "getViewModelGenre", "viewModelGenre$delegate", "weatherViewModel", "getWeatherViewModel", "weatherViewModel$delegate", "hideKeyboard", "", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "movie", "Lcom/example/ads/model/Movie;", "searchData", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.ads.adapter.MovieAdapter.OnItemClickListener {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy weatherViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModelGenre$delegate = null;
    private com.example.ads.databinding.ActivityMainBinding binding;
    @org.jetbrains.annotations.NotNull
    private final com.example.ads.adapter.MovieAdapter movieadapter = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.ads.adapter.GenreAdapter genreAdapter = null;
    
    public MainActivity() {
        super();
    }
    
    private final com.example.ads.viewmodel.MovieViewModel getWeatherViewModel() {
        return null;
    }
    
    private final com.example.ads.viewmodel.MovieViewModel getViewModel() {
        return null;
    }
    
    private final com.example.ads.viewmodel.MovieViewModel getViewModelGenre() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final void searchData() {
    }
    
    private final void hideKeyboard() {
    }
    
    @java.lang.Override
    public void onItemClick(@org.jetbrains.annotations.NotNull
    com.example.ads.model.Movie movie) {
    }
}