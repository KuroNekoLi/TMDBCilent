package com.example.tmdbcilent.data.repository.movie.datasource

import com.example.tmdbcilent.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
    suspend fun getMovies() : Response<MovieList>
}