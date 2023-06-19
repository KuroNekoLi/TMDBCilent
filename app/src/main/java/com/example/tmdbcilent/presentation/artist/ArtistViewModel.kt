package com.example.tmdbcilent.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.tmdbcilent.domain.GetArtistUseCase
import com.example.tmdbcilent.domain.GetMovieUseCase
import com.example.tmdbcilent.domain.UpdateArtistUseCase
import com.example.tmdbcilent.domain.UpdateMoviesUseCase

class ArtistViewModel(
    private val getArtistsUseCase: GetArtistUseCase,
    private val updateArtistsUseCase: UpdateArtistUseCase
) :ViewModel() {
    fun getMovies() = liveData {
        val artistList = getArtistsUseCase
        emit(artistList)
    }

    fun updateMovies() = liveData {
        val artistList = updateArtistsUseCase.execute()
        emit(artistList)
    }
}