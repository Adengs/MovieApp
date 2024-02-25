package com.example.ads.page.home

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.TextView.OnEditorActionListener
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.recyclerview.widget.GridLayoutManager
import com.example.ads.adapter.GenreAdapter
import com.example.ads.adapter.MovieAdapter
import com.example.ads.connection.MovieLoadStateAdapter
import com.example.ads.databinding.ActivityMainBinding
import com.example.ads.model.Movie
import com.example.ads.viewmodel.MovieViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), MovieAdapter.OnItemClickListener {

    private val weatherViewModel: MovieViewModel by viewModels()
    private val viewModel by viewModels<MovieViewModel>()
    private val viewModelGenre by viewModels<MovieViewModel>()
    private lateinit var binding: ActivityMainBinding
    private val movieadapter = MovieAdapter(this)
    private val genreAdapter = GenreAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
        searchData()
//        setEvent()
    }

//    private fun setEvent() {
//        val searchView = binding.etSearch
//
//        searchView.setOn
//    }

    private fun initView() {
        binding.rvMovie.apply {
            adapter = movieadapter.withLoadStateHeaderAndFooter(
                header = MovieLoadStateAdapter {movieadapter.retry()},
                footer = MovieLoadStateAdapter {movieadapter.retry()}
            )
            layoutManager = GridLayoutManager(this@MainActivity, 3)
        }

        binding.btnRetry.setOnClickListener {
            movieadapter.retry()
        }

        movieadapter.addLoadStateListener { loadState ->
            binding.apply {
                progressbar.isVisible = loadState.source.refresh is LoadState.Loading
                rvMovie.isVisible = loadState.source.refresh is LoadState.NotLoading
                layFailed.isVisible = loadState.source.refresh is LoadState.Error

                //not found
                if (loadState.source.refresh is LoadState.NotLoading && loadState.append.endOfPaginationReached && movieadapter.itemCount < 1){
                    rvMovie.isVisible = false
                    tvNotFound.isVisible = true
                }else{
                    tvNotFound.isVisible = false
                }
            }
        }
        viewModel.movies.observe(this) {
            movieadapter.submitData(this.lifecycle, it)
        }
    }

    private fun searchData() {
        binding.etSearch.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                binding.rvMovie.scrollToPosition(0)
                viewModel.searchMovies(s.toString())
            }

            override fun afterTextChanged(s: Editable) {}
        })

        binding.etSearch.setOnEditorActionListener(OnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                hideKeyboard()
                binding.etSearch.clearFocus()
                return@OnEditorActionListener true
            }
            false
        })
    }

    private fun hideKeyboard() {
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
    }

    override fun onItemClick(movie: Movie) {
        val intent = Intent(this, DetailMovieActivity::class.java)
        intent.putExtra(DetailMovieActivity.MOV_ID, movie)
        startActivity(intent)
    }
}