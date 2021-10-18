package com.example.my.feature.main_screen.di

import com.example.my.feature.main_screen.data.api.NewsApi
import com.example.my.feature.main_screen.data.api.NewsRemoteSource
import com.example.my.feature.main_screen.data.api.NewsRepo
import com.example.my.feature.main_screen.data.api.NewsRepoImpl
import com.example.my.feature.main_screen.domain.NewsInteractor
import com.example.my.feature.main_screen.ui.NewsScreenViewModel
import okhttp3.OkHttpClient
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://newsapi.org/v2/top-headlines?country=ru&apiKey=API_KEY"


val appModule = module {

    single<OkHttpClient> {
        OkHttpClient.Builder()
            .build()
    }

    single {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
    }

    single<NewsApi> {
        get<Retrofit>().create(NewsApi::class.java)
    }

    single<NewsRemoteSource> {
        NewsRemoteSource(get<NewsApi>())
    }

    single<NewsRepo> {
        NewsRepoImpl(get<NewsRemoteSource>())
    }

    single<NewsInteractor> {
         NewsInteractor(get<NewsRepo>())
    }

    viewModel {
        NewsScreenViewModel(get<NewsInteractor>())
    }
}