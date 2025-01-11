package com.example.news_app.api

import com.example.news_app.models.NewsResponse
import com.example.news_app.ui.utils.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country") countryCode:String = "us",
        @Query("page") pageNumber : Int = 1,
        @Query ("apiKey" ) apiKey:String = API_KEY
    ):Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q") searchQuery:String,
        @Query("page") pageNumber : Int = 1,
        @Query ("apiKey" ) apiKey:String = API_KEY
    ):Response<NewsResponse>
}