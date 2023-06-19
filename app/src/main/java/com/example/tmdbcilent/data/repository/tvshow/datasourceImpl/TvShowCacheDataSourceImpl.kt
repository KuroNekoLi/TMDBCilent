package com.example.tmdbcilent.data.repository.tvshow.datasourceImpl

import com.example.tmdbcilent.data.model.tvshow.TvShow
import com.example.tmdbcilent.data.repository.tvshow.TvShowCacheDataSource

class TvShowCacheDataSourceImpl :
    TvShowCacheDataSource {
    private var tvShowList = ArrayList<TvShow>()

    override suspend fun getTvShowsFromCache(): List<TvShow> {
        return tvShowList
    }

    override suspend fun saveTvShowsToCache(tvShows: List<TvShow>) {
       tvShowList.clear()
       tvShowList = ArrayList(tvShows)
    }
}