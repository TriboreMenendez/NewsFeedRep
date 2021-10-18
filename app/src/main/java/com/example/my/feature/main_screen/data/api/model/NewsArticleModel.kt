package com.example.my.feature.main_screen.data.api.model

import com.google.gson.annotations.SerializedName

data class NewsArticleModel(
    //@SerializedName("source") val source: SourceModel,
    //@SerializedName("author") val author: String,
    @SerializedName("title") val title: String,
    @SerializedName("description") val description: String,
    //@SerializedName("url") val url: String,
    //@SerializedName("urlToImage") val urlToImage: String,
    @SerializedName("publishedAt") val datePublished: String,
    @SerializedName("content") val content: String

    )

/*
-"source": {
    "id": "cnn",
    "name": "CNN"
},
"author": "Devan Cole, CNN",
"title": "Colin Powell, military leader and first Black US secretary of state, dies after complications from Covid-19 - CNN",
"description": "Colin Powell, the first Black US secretary of state whose leadership in several Republican administrations helped shape American foreign policy in the last years of the 20th century and the early years of the 21st, has died from complications from Covid-19, h…",
"url": "https://www.cnn.com/2021/10/18/politics/colin-powell-dies/index.html",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/211018070806-01-colin-powell-super-tease.jpg",
"publishedAt": "2021-10-18T12:14:00Z",
"content":*/
