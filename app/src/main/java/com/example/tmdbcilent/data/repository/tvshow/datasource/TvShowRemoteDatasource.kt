package com.example.tmdbcilent.data.repository.tvshow.datasource

import com.example.tmdbcilent.data.model.artist.Artist
import com.example.tmdbcilent.data.model.movie.MovieList
import com.example.tmdbcilent.data.model.tvshow.TvShow
import com.example.tmdbcilent.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {
    suspend fun getTvShows() : Response<TvShowList>
}