package com.example.tmdbcilent.data.repository.artist.datasource

import com.example.tmdbcilent.data.model.artist.Artist

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache():List<Artist>
    suspend fun saveArtistsToCache(movies:List<Artist>)
}