package com.example.tmdbcilent.data.repository.tvshow

import com.example.tmdbcilent.data.model.artist.Artist
import com.example.tmdbcilent.data.model.tvshow.TvShow

interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache():List<TvShow>
    suspend fun saveTvShowsToCache(movies:List<TvShow>)
}