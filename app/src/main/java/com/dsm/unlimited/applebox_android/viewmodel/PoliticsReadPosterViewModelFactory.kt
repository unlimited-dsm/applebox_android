package com.dsm.unlimited.applebox_android.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dsm.unlimited.applebox_android.util.BackNavigator

class PoliticsReadPosterViewModelFactory(val backNavigator: BackNavigator) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T = modelClass.getConstructor(BackNavigator::class.java).newInstance(backNavigator)
}