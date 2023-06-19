package com.example.tmdbcilent.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.tmdbcilent.domain.GetArtistUseCase
import com.example.tmdbcilent.domain.GetMovieUseCase
import com.example.tmdbcilent.domain.UpdateArtistUseCase
import com.example.tmdbcilent.domain.UpdateMoviesUseCase

class ArtistViewModelFactory(
    private val getArtistsUseCase: GetArtistUseCase,
    private val updateArtistsUseCase: UpdateArtistUseCase
) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ArtistViewModel(getArtistsUseCase, updateArtistsUseCase) as T
    }
}