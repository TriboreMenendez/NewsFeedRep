package com.example.my.feature.main_screen.data.api

import com.example.my.feature.main_screen.data.api.model.NewsModel
import com.example.my.feature.main_screen.domain.model.NewsDomainModel

fun NewsModel.toDomain(): NewsDomainModel {
    return NewsDomainModel(
        this.articles.title,
        this.articles.description,
        this.articles.datePublished,
        this.articles.content
    )
}