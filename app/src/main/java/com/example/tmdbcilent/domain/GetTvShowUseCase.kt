package com.example.tmdbcilent.domain

import com.example.tmdbcilent.data.model.tvshow.TvShow
import com.example.tmdbcilent.domain.repository.TvShowRepository

class GetTvShowUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>? = tvShowRepository.getTvShows()
}