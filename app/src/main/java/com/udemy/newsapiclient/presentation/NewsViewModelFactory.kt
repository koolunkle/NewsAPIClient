package com.udemy.newsapiclient.presentation

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.udemy.newsapiclient.domain.usecase.GetNewsHeadlinesUseCase

class NewsViewModelFactory(
    private val application: Application,
    private val getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(
            Application::class.java, GetNewsHeadlinesUseCase::class.java
        ).newInstance(application, getNewsHeadlinesUseCase)
    }
}