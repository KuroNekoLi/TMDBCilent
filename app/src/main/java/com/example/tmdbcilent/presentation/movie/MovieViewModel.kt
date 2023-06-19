package com.example.tmdbcilent.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.tmdbcilent.domain.GetMovieUseCase
import com.example.tmdbcilent.domain.UpdateMoviesUseCase

class MovieViewModel(
    private val getMovieUseCase: GetMovieUseCase,
    private val updateMoviesUseCase: UpdateMoviesUseCase
) :ViewModel() {
    fun getMovies() = liveData {
        val movieList = getMovieUseCase.execute()
        emit(movieList)
    }

    fun updateMovies() = liveData {
        val movieList = updateMoviesUseCase.execute()
        emit(movieList)
    }
}