package com.example.tmdbcilent.domain.repository

import com.example.tmdbcilent.data.model.artist.Artist
import com.example.tmdbcilent.data.model.movie.Movie

interface ArtistRepository {
    suspend fun getArtists() : List<Artist>?
    suspend fun updateArtists(): List<Artist>?
}