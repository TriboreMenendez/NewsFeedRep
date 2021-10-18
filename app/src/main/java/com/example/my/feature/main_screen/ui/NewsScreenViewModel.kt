package com.example.my.feature.main_screen.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.my.feature.main_screen.domain.NewsInteractor
import com.example.my.feature.main_screen.domain.model.NewsDomainModel
import kotlinx.coroutines.launch

class NewsScreenViewModel(private val newsInteractor: NewsInteractor) : ViewModel() {


}