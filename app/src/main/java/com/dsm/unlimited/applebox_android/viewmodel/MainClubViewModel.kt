package com.dsm.unlimited.applebox_android.viewmodel

import androidx.lifecycle.Lifecycle
import com.dsm.unlimited.applebox_android.util.ChannelNavigator
import com.dsm.unlimited.applebox_android.viewmodel.base.BaseViewModel

class MainClubViewModel(val channelNavigator: ChannelNavigator) : BaseViewModel() {
    override fun apply(event: Lifecycle.Event) {

    }

    override fun clear() {

    }

    fun addChannel() {

    }

    fun navigateChannel() = channelNavigator.navigateChannel()
}