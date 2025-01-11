package com.example.news_app.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.news_app.repository.NewsRepository

class NewsViewModelProviderFactory(
    val app:Application,
    val newsRepository: NewsRepository
) :ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        @Suppress("UNCHECKED_CAST")
        return NewsViewModel(app,newsRepository) as T
    }
}