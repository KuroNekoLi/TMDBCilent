package com.example.tmdbcilent.data.repository.tvshow.datasourceImpl

import com.example.tmdbcilent.data.api.TMDBService
import com.example.tmdbcilent.data.model.tvshow.TvShowList
import com.example.tmdbcilent.data.repository.tvshow.datasource.TvShowRemoteDatasource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): TvShowRemoteDatasource {
    override suspend fun getTvShows()
            : Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}

