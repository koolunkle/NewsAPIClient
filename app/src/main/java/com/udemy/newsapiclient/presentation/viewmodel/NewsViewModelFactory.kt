package com.udemy.newsapiclient.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.udemy.newsapiclient.domain.usecase.GetNewsHeadlinesUseCase
import com.udemy.newsapiclient.domain.usecase.GetSearchedNewsUseCase
import com.udemy.newsapiclient.domain.usecase.SaveNewsUseCase

class NewsViewModelFactory(
    private val application: Application,
    private val getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase,
    private val getSearchedNewsUseCase: GetSearchedNewsUseCase,
    private val saveNewsUseCase: SaveNewsUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(
            Application::class.java,
            GetNewsHeadlinesUseCase::class.java,
            GetSearchedNewsUseCase::class.java,
            SaveNewsUseCase::class.java
        ).newInstance(application, getNewsHeadlinesUseCase, getSearchedNewsUseCase, saveNewsUseCase)
    }
}