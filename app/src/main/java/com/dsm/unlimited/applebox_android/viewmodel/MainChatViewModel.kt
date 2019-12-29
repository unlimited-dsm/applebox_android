package com.dsm.unlimited.applebox_android.viewmodel

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.MutableLiveData
import com.dsm.unlimited.applebox_android.util.ChatNavigator
import com.dsm.unlimited.applebox_android.viewmodel.base.BaseViewModel

class MainChatViewModel(val chatNavigator: ChatNavigator) : BaseViewModel() {
    override fun apply(event: Lifecycle.Event) {

    }

    override fun clear() {

    }

    fun chatNavigate() = chatNavigator.chatNavigate()
}