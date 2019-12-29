package com.dsm.unlimited.applebox_android.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dsm.unlimited.applebox_android.util.PoliticsNavigator

class MainPoliticsViewModelFactory(val politicsNavigator: PoliticsNavigator) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T = modelClass.getConstructor(PoliticsNavigator::class.java).newInstance(politicsNavigator)
}