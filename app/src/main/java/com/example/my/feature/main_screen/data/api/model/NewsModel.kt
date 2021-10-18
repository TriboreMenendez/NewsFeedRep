package com.example.my.feature.main_screen.data.api.model

import com.google.gson.annotations.SerializedName

data class NewsModel (
    @SerializedName("status") val status: String,
    @SerializedName("totalResult") val totalResult: String,
    @SerializedName("articles") val articles: NewsArticleModel //List<NewsArticleModel>

)

/*
status": "ok",
"totalResults": 38,
-"articles": [
-{
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
    "content": "(CNN)Colin Powell, the first Black US secretary of state whose leadership in several Republican administrations helped shape American foreign policy in the last years of the 20th century and the earl… [+11658 chars]"
},*/
