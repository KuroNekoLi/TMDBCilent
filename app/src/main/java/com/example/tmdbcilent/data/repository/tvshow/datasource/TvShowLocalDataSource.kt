package com.example.tmdbcilent.data.repository.tvshow

import com.example.tmdbcilent.data.model.artist.Artist
import com.example.tmdbcilent.data.model.tvshow.TvShow

interface TvShowLocalDataSource{
    suspend fun getTvShowsFromDB():List<TvShow>
    suspend fun saveTvShowsToDB(movie: List<TvShow>)
    suspend fun clearAll()
}