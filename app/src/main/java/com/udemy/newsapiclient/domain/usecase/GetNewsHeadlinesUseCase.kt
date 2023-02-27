package com.udemy.newsapiclient.domain.usecase

import com.udemy.newsapiclient.data.model.APIResponse
import com.udemy.newsapiclient.data.util.Resource
import com.udemy.newsapiclient.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(): Resource<APIResponse> {
        return newsRepository.getNewsHeadlines()
    }
}