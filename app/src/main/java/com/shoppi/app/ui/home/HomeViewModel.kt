package com.shoppi.app.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shoppi.app.model.Banner
import com.shoppi.app.model.Promotion
import com.shoppi.app.model.Title
import com.shoppi.app.repository.home.HomeRepository
import com.shoppi.app.ui.common.Event

class HomeViewModel(private val homeRepository: HomeRepository) : ViewModel() {

    private val _title = MutableLiveData<Title>()
    val title: LiveData<Title> = _title

    private val _topBanner = MutableLiveData<List<Banner>>()
    val topBanners: LiveData<List<Banner>> = _topBanner

    private val _promotions = MutableLiveData<Promotion>()
    val promotions: LiveData<Promotion> = _promotions

    private val _openProductEvent = MutableLiveData<Event<String>>()
    val openProductEvent: LiveData<Event<String>> = _openProductEvent

    init {
        loadHomeData()

    }

    fun openProductDetail(productId: String) {
        _openProductEvent.value = Event(productId)
    }

    private fun loadHomeData() {
        val homeData = homeRepository.getHomeData()
        homeData?.let {
            _title.value = it.title
            _topBanner.value = it.topBanners
            _promotions.value = it.promotions
        }
    }
}