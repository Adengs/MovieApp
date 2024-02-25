package com.example.ads.page.home

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.example.ads.R
import com.example.ads.databinding.ActivityDetailMovieBinding
import com.example.ads.model.Movie
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailMovieActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailMovieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setEvent()
        setData()
    }

    private fun setEvent() {
        binding.ivBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }

    private fun setData(){
        val movie : Movie = intent.getParcelableExtra(MOV_ID)!!
        binding.apply {
            Glide.with(this@DetailMovieActivity)
                .load("${movie.baseUrl}${movie.poster_path}")
                .error(R.drawable.ic_error)
                .listener(object  : RequestListener<Drawable>{
                    override fun onLoadFailed(
                        e: GlideException?,
                        model: Any?,
                        target: Target<Drawable>,
                        isFirstResource: Boolean,
                    ): Boolean {
                        progressbar.isVisible = false
                        return false
                    }

                    override fun onResourceReady(
                        resource: Drawable,
                        model: Any,
                        target: Target<Drawable>?,
                        dataSource: DataSource,
                        isFirstResource: Boolean,
                    ): Boolean {
                        progressbar.isVisible = false
                        return false
                    }

                }).into(poster)
            titleMovie.text = movie.original_title
//            genre.text = movie.genre
            years.text = movie.release_date
//            duration.text = movie.
            descMovie.text = movie.overview
        }
    }

    companion object{
        const val MOV_ID = "mov-id"
    }
}