package com.example.tmdbcilent.domain.repository

import com.example.tmdbcilent.data.model.movie.Movie
import com.example.tmdbcilent.data.model.tvshow.TvShow

interface TvShowRepository {
    suspend fun getTvShows() : List<TvShow>?
    suspend fun updateTvShows(): List<TvShow>?
}