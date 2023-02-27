package com.udemy.newsapiclient.domain.usecase

import com.udemy.newsapiclient.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {

}