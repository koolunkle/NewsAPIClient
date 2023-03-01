package com.udemy.newsapiclient.data.repository.dataSourceImpl

import com.udemy.newsapiclient.data.db.ArticleDAO
import com.udemy.newsapiclient.data.model.Article
import com.udemy.newsapiclient.data.repository.dataSource.NewsLocalDataSource

class NewsLocalDataSourceImpl(
    private val articleDAO: ArticleDAO
) : NewsLocalDataSource {

    override suspend fun saveArticleToDB(article: Article) {
        articleDAO.insert(article)
    }
}