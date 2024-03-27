package br.com.movieapp.movie_popular.data.source

import br.com.movieapp.core.data.remote.MovieService
import br.com.movieapp.core.data.remote.response.MovieResponse
import br.com.movieapp.core.paging.MoviePageSource
import br.com.movieapp.movie_popular.domain.source.MoviePopularRemoteDataSource

class MoviePopularRemoteDataSourceImpl constructor(
    private val service: MovieService
) : MoviePopularRemoteDataSource {

    override fun getPopularMoviePagingSource(): MoviePageSource {
        return MoviePageSource(this)
    }

    override suspend fun getPopularMovies(page: Int): MovieResponse {
        return service.getPopularMovies(page = page)
    }
}