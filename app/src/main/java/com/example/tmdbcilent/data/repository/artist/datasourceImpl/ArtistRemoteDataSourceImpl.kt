package com.example.tmdbcilent.data.repository.artist.datasourceImpl

import com.example.tmdbcilent.data.api.TMDBService
import com.example.tmdbcilent.data.model.artist.ArtistList

import com.example.tmdbcilent.data.repository.artist.datasource.ArtistRemoteDatasource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): ArtistRemoteDatasource {
    override suspend fun getArtists()
            : Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}


