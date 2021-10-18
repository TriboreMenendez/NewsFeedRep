package com.example.my.feature.main_screen.data.api

import com.example.my.feature.main_screen.data.api.model.NewsModel

class NewsRemoteSource(private val api: NewsApi) {
    suspend fun getNews(): NewsModel = api.getNews()
}
