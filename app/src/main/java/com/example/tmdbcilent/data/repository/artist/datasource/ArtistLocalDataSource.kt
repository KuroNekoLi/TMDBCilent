package com.example.tmdbcilent.data.repository.artist

import com.example.tmdbcilent.data.model.artist.Artist

interface ArtistLocalDataSource{
    suspend fun getArtistsFromDB():List<Artist>
    suspend fun saveArtistsToDB(movie: List<Artist>)
    suspend fun clearAll()
}