package com.example.tmdbcilent.data.repository.artist.datasource

import com.example.tmdbcilent.data.model.artist.Artist
import com.example.tmdbcilent.data.model.artist.ArtistList
import com.example.tmdbcilent.data.model.movie.MovieList
import retrofit2.Response

interface ArtistRemoteDatasource {
    suspend fun getArtists() : Response<ArtistList>
}