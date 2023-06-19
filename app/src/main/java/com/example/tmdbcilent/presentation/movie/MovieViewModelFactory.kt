package com.example.tmdbcilent.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.tmdbcilent.domain.GetMovieUseCase
import com.example.tmdbcilent.domain.UpdateMoviesUseCase

class MovieViewModelFactory(
    private val getMovieUseCase: GetMovieUseCase,
    private val updateMoviesUseCase: UpdateMoviesUseCase
) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MovieViewModel(getMovieUseCase,updateMoviesUseCase) as T
    }
}