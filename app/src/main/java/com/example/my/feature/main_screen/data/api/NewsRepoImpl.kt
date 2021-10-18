package com.example.my.feature.main_screen.data.api

import com.example.my.feature.main_screen.domain.model.NewsDomainModel

class NewsRepoImpl(private val source: NewsRemoteSource) : NewsRepo {
    override suspend fun getNews(): NewsDomainModel {
        return source.getNews().toDomain()
    }
}