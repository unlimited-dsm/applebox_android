package com.dsm.unlimited.applebox_android.viewmodel

import androidx.lifecycle.Lifecycle
import com.dsm.unlimited.applebox_android.util.HomeNavigator
import com.dsm.unlimited.applebox_android.viewmodel.base.BaseViewModel

class MainHomeViewModel(val navigator : HomeNavigator) : BaseViewModel() {
    override fun apply(event: Lifecycle.Event) {

    }

    override fun clear() {

    }

    fun writePoster() = navigator.navigateWritePoster()

    fun readPoster() = navigator.navigateReadPoster()

    fun search() {

    }
}