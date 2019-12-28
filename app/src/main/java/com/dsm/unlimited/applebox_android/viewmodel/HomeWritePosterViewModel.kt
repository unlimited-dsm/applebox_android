package com.dsm.unlimited.applebox_android.viewmodel

import androidx.lifecycle.Lifecycle
import com.dsm.unlimited.applebox_android.util.BackNavigator
import com.dsm.unlimited.applebox_android.viewmodel.base.BaseViewModel

class HomeWritePosterViewModel(val backNavigator: BackNavigator) : BaseViewModel() {
    override fun apply(event: Lifecycle.Event) {

    }

    override fun clear() {

    }

    fun backPressed() = backNavigator.backNavigate()
}