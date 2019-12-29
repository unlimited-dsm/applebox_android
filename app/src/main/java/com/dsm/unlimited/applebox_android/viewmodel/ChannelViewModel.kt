package com.dsm.unlimited.applebox_android.viewmodel

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.MutableLiveData
import com.dsm.unlimited.applebox_android.util.BackNavigator
import com.dsm.unlimited.applebox_android.viewmodel.base.BaseViewModel

class ChannelViewModel(val backNavigator: BackNavigator) : BaseViewModel() {

    val name = MutableLiveData("ask")

    val inputMessage = MutableLiveData<String>()

    override fun apply(event: Lifecycle.Event) {

    }

    override fun clear() {

    }

    fun backPressed() = backNavigator.backNavigate()

    fun sendMessage() {

    }
}