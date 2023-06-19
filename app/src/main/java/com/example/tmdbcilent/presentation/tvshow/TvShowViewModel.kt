package com.example.tmdbcilent.presentation.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.tmdbcilent.domain.GetMovieUseCase
import com.example.tmdbcilent.domain.GetTvShowUseCase
import com.example.tmdbcilent.domain.UpdateMoviesUseCase
import com.example.tmdbcilent.domain.UpdateTvShowUseCase

class TvShowViewModel(
    private val getTvShowUseCase: GetTvShowUseCase,
    private val updateTvShowsUseCase: UpdateTvShowUseCase
) :ViewModel() {
    fun getMovies() = liveData {
        val tvShowList = getTvShowUseCase.execute()
        emit(tvShowList)
    }

    fun updateMovies() = liveData {
        val tvShowList = updateTvShowsUseCase.execute()
        emit(tvShowList)
    }
}