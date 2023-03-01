package com.udemy.newsapiclient.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.udemy.newsapiclient.domain.usecase.GetNewsHeadlinesUseCase
import com.udemy.newsapiclient.domain.usecase.GetSavedNewsUseCase
import com.udemy.newsapiclient.domain.usecase.GetSearchedNewsUseCase
import com.udemy.newsapiclient.domain.usecase.SaveNewsUseCase

class NewsViewModelFactory(
    private val application: Application,
    private val getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase,
    private val getSearchedNewsUseCase: GetSearchedNewsUseCase,
    private val saveNewsUseCase: SaveNewsUseCase,
    private val getSavedNewsUseCase: GetSavedNewsUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(
            Application::class.java,
            GetNewsHeadlinesUseCase::class.java,
            GetSearchedNewsUseCase::class.java,
            SaveNewsUseCase::class.java,
            GetSavedNewsUseCase::class.java
        ).newInstance(
            application,
            getNewsHeadlinesUseCase,
            getSearchedNewsUseCase,
            saveNewsUseCase,
            getSavedNewsUseCase
        )
    }
}