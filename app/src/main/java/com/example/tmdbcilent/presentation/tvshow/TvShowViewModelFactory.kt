package com.example.tmdbcilent.presentation.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.tmdbcilent.domain.GetMovieUseCase
import com.example.tmdbcilent.domain.GetTvShowUseCase
import com.example.tmdbcilent.domain.UpdateMoviesUseCase
import com.example.tmdbcilent.domain.UpdateTvShowUseCase

class TvShowViewModelFactory(
    private val getTvShowUseCase: GetTvShowUseCase,
    private val updateTvShowsUseCase: UpdateTvShowUseCase
) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TvShowViewModelFactory(getTvShowUseCase, updateTvShowsUseCase) as T
    }
}