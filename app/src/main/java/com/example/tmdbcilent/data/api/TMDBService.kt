package com.example.tmdbcilent.data.api

import com.example.tmdbcilent.data.model.artist.ArtistList
import com.example.tmdbcilent.data.model.movie.MovieList
import com.example.tmdbcilent.data.model.tvshow.TvShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface TMDBService {

    @GET("movie/popular")
    suspend fun getPopularMovies(@Header("Authorization") accessToken :String): Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTvShows(@Header("Authorization") accessToken :String): Response<TvShowList>

    @GET("person/popular")
    suspend fun getPopularArtists(@Header("Authorization") accessToken :String): Response<ArtistList>
}