package com.example.news_app.repository

import com.example.news_app.api.RetrofitInstance
import com.example.news_app.db.ArticleDatabase
import com.example.news_app.models.Article
import retrofit2.http.Query
import java.util.Locale.IsoCountryCode

class NewsRepository(val db: ArticleDatabase) {
    suspend fun getBreakingNews(countryCode: String, pageNumber:Int)=
        RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)
    suspend fun searchNews(searchQuery: String, pageNumber:Int)=
        RetrofitInstance.api.searchForNews(searchQuery,pageNumber)

    suspend fun updateOrInsert(article:Article) = db.getArticleDao().updateOrInsert(article)

    fun getSavedNews()= db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}