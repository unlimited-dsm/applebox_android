package com.dsm.unlimited.applebox_android.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dsm.unlimited.applebox_android.util.ChannelNavigator

class MainClubViewModelFactory(val channelNavigator: ChannelNavigator) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T = modelClass.getConstructor(ChannelNavigator::class.java).newInstance(channelNavigator)
}