package com.example.tmdbcilent.data.repository.movie.datasource

import com.example.tmdbcilent.data.model.movie.Movie

interface MovieLocalDataSource{
    suspend fun getMoviesFromDB():List<Movie>
    suspend fun saveMoviesToDB(movie: List<Movie>)
    suspend fun clearAll()
}