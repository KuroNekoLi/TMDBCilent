package com.example.tmdbcilent.domain

import com.example.tmdbcilent.data.model.artist.Artist
import com.example.tmdbcilent.domain.repository.ArtistRepository

class UpdateArtistUseCase(private val ArtistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = ArtistRepository.updateArtists()
}