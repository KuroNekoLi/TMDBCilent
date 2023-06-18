package com.example.tmdbcilent.domain

import com.example.tmdbcilent.data.model.movie.Movie
import com.example.tmdbcilent.domain.repository.MovieRepository

class UpdateMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>? = movieRepository.updateMovies()
}