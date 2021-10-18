package com.example.my.feature.main_screen.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.my.feature.main_screen.domain.NewsInteractor
import com.example.my.feature.main_screen.domain.model.NewsDomainModel
import kotlinx.coroutines.launch

class MainScreenViewModel (private val newsInteractor: NewsInteractor): ViewModel() {
    val lifeData: MutableLiveData<NewsDomainModel> = MutableLiveData()

    fun reqNews() {
        viewModelScope.launch {
            lifeData.postValue(newsInteractor.getNews())
        }
    }

}