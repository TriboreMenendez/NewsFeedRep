package com.example.my.feature.main_screen.data.api

import com.example.my.feature.main_screen.data.api.model.NewsModel
import retrofit2.http.GET
import retrofit2.http.Query

//https://newsapi.org/v2/top-headlines?country=ru&apiKey=API_KEY

interface NewsApi {
    @GET("v2/top-headlines")
    suspend fun getNews(
        @Query("country") country: String = "ru",
        @Query("apiKey") apiKey: String = "daa5bbe8c37b4154884e261dfa6cb771",
        //@Query("q") q:String =""
    ): NewsModel
}