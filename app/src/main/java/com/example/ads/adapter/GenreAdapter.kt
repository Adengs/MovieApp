package com.example.ads.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.example.ads.R
import com.example.ads.databinding.ItemCategoryBinding
import com.example.ads.databinding.ItemMovieBinding
import com.example.ads.model.Genre
import com.example.ads.model.Movie

class GenreAdapter : PagingDataAdapter<Genre, GenreAdapter.MovieViewHolder>(COMPARATUR) {

    inner class MovieViewHolder(private val binding: ItemCategoryBinding)
        : RecyclerView.ViewHolder(binding.root){
        fun bind(genre: Genre){
            with(binding){
                textType.setText(genre.name)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding = ItemCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val currentItem = getItem(position)
        if (currentItem != null){
            holder.bind(currentItem)
        }
    }

    companion object{
        private  val COMPARATUR = object : DiffUtil.ItemCallback<Genre>(){
            override fun areItemsTheSame(oldItem: Genre, newItem: Genre): Boolean =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Genre, newItem: Genre): Boolean =
                oldItem.id == newItem.id

        }
    }
}