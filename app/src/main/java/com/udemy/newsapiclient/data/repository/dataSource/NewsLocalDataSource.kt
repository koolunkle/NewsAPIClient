package com.udemy.newsapiclient.data.repository.dataSource

import com.udemy.newsapiclient.data.model.Article

interface NewsLocalDataSource {

    suspend fun saveArticleToDB(article: Article)
}