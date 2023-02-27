package com.udemy.newsapiclient.domain.usecase

import com.udemy.newsapiclient.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {

}