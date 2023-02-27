package com.udemy.newsapiclient.data.repository.dataSourceImpl

import com.udemy.newsapiclient.data.api.NewsAPIService
import com.udemy.newsapiclient.data.model.APIResponse
import com.udemy.newsapiclient.data.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService, private val country: String, private val page: Int
) : NewsRemoteDataSource {

    override suspend fun getTopHeadlines(): Response<APIResponse> {
        return newsAPIService.getTopHeadlines(country, page)
    }
}