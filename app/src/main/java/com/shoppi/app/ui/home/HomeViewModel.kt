package com.shoppi.app.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shoppi.app.model.Banner
import com.shoppi.app.model.Title
import com.shoppi.app.repository.home.HomeRepository

class HomeViewModel(private val homeRepository: HomeRepository) : ViewModel() {

    private val _title = MutableLiveData<Title>()
    val title: LiveData<Title> = _title

    private val _topBanner = MutableLiveData<List<Banner>>()
    val topBanners: LiveData<List<Banner>> = _topBanner

    init {
        loadHomeData()

    }

    private fun loadHomeData() {
        val homeData = homeRepository.getHomeData()
        homeData?.let {
            _title.value = it.title
            _topBanner.value = it.topBanners
        }
    }
}