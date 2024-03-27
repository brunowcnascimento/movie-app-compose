package br.com.movieapp.movie_popular.domain.source

import br.com.movieapp.core.data.remote.response.MovieResponse
import br.com.movieapp.core.paging.MoviePageSource

interface MoviePopularRemoteDataSource {

    fun getPopularMoviePagingSource(): MoviePageSource

    suspend fun getPopularMovies(page: Int): MovieResponse
}