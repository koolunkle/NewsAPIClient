package com.udemy.newsapiclient.domain.usecase

import com.udemy.newsapiclient.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {

}