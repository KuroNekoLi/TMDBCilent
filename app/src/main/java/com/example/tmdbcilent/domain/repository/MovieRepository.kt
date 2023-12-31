package com.example.tmdbcilent.domain.repository

import com.example.tmdbcilent.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies() : List<Movie>?
    suspend fun updateMovies(): List<Movie>?
}