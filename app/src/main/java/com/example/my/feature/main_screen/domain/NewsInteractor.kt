package com.example.my.feature.main_screen.domain

import com.example.my.feature.main_screen.data.api.NewsRepo
import com.example.my.feature.main_screen.domain.model.NewsDomainModel

class NewsInteractor(private val repository: NewsRepo) {
    suspend fun getNews(): NewsDomainModel {
        return repository.getNews()
    }
}