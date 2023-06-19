package com.example.tmdbcilent.data.repository.movie.datasourceimpl

import com.example.tmdbcilent.data.api.TMDBService
import com.example.tmdbcilent.data.model.movie.MovieList
import com.example.tmdbcilent.data.repository.movie.datasource.MovieRemoteDatasource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey :String
    ) : MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> =
        tmdbService.getPopularMovies(apiKey)

}