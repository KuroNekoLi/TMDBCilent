package com.example.tmdbcilent.data.repository.movie.datasourceimpl

import com.example.tmdbcilent.data.model.movie.Movie
import com.example.tmdbcilent.data.repository.movie.datasource.MovieLocalDataSource

class MovieCacheDataSourceImpl : MovieLocalDataSource {
    private var movieList = ArrayList<Movie>()
    override suspend fun getMoviesFromDB(): List<Movie> =movieList

    override suspend fun saveMoviesToDB(movie: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movie)
    }

    override suspend fun clearAll() {
        TODO("Not yet implemented")
    }
}