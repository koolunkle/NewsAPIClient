package com.udemy.newsapiclient.domain.usecase

import com.udemy.newsapiclient.domain.repository.NewsRepository

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {

}