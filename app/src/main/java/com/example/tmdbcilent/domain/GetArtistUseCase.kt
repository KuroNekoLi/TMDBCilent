package com.example.tmdbcilent.domain

import com.example.tmdbcilent.data.model.artist.Artist
import com.example.tmdbcilent.domain.repository.ArtistRepository

class GetArtistUseCase(private val ArtistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = ArtistRepository.getArtists()
}