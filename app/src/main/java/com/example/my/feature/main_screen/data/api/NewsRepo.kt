package com.example.my.feature.main_screen.data.api

import com.example.my.feature.main_screen.domain.model.NewsDomainModel

interface NewsRepo {
    suspend fun getNews(): NewsDomainModel
}