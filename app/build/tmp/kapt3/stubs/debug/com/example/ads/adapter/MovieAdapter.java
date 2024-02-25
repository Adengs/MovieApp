package com.example.ads.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.example.ads.R;
import com.example.ads.databinding.ItemMovieBinding;
import com.example.ads.model.Movie;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0010\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/ads/adapter/MovieAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/example/ads/model/Movie;", "Lcom/example/ads/adapter/MovieAdapter$MovieViewHolder;", "listener", "Lcom/example/ads/adapter/MovieAdapter$OnItemClickListener;", "(Lcom/example/ads/adapter/MovieAdapter$OnItemClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "MovieViewHolder", "OnItemClickListener", "app_debug"})
public final class MovieAdapter extends androidx.paging.PagingDataAdapter<com.example.ads.model.Movie, com.example.ads.adapter.MovieAdapter.MovieViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final com.example.ads.adapter.MovieAdapter.OnItemClickListener listener = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.ads.model.Movie> COMPARATUR = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.ads.adapter.MovieAdapter.Companion Companion = null;
    
    public MovieAdapter(@org.jetbrains.annotations.NotNull
    com.example.ads.adapter.MovieAdapter.OnItemClickListener listener) {
        super(null, null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.ads.adapter.MovieAdapter.MovieViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.ads.adapter.MovieAdapter.MovieViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/ads/adapter/MovieAdapter$Companion;", "", "()V", "COMPARATUR", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/ads/model/Movie;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/ads/adapter/MovieAdapter$MovieViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/ads/databinding/ItemMovieBinding;", "(Lcom/example/ads/adapter/MovieAdapter;Lcom/example/ads/databinding/ItemMovieBinding;)V", "bind", "", "movie", "Lcom/example/ads/model/Movie;", "app_debug"})
    public final class MovieViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.ads.databinding.ItemMovieBinding binding = null;
        
        public MovieViewHolder(@org.jetbrains.annotations.NotNull
        com.example.ads.databinding.ItemMovieBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.example.ads.model.Movie movie) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/ads/adapter/MovieAdapter$OnItemClickListener;", "", "onItemClick", "", "movie", "Lcom/example/ads/model/Movie;", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull
        com.example.ads.model.Movie movie);
    }
}