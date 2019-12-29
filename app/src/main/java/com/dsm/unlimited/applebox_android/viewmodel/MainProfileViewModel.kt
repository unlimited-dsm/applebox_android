package com.dsm.unlimited.applebox_android.viewmodel

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.MutableLiveData
import com.dsm.unlimited.applebox_android.util.ProfileNavigator
import com.dsm.unlimited.applebox_android.viewmodel.base.BaseViewModel

class MainProfileViewModel(val profileNavigator: ProfileNavigator) : BaseViewModel() {

    val notificationCount = MutableLiveData<Int>(5)

    override fun apply(event: Lifecycle.Event) {

    }

    override fun clear() {

    }

    fun showNotificate() = profileNavigator.showNotificate()

    fun readPoster() = profileNavigator.readPoster()
}