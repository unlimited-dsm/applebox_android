package com.dsm.unlimited.applebox_android.viewmodel

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.MutableLiveData
import com.dsm.unlimited.applebox_android.viewmodel.base.BaseViewModel

class ChatViewModel() : BaseViewModel() {

    val inputMessage = MutableLiveData<String>()
    val name = MutableLiveData<String>("이름")

    fun sendMessage() {

    }

    fun backPressed() {

    }

    override fun apply(event: Lifecycle.Event) {

    }

    override fun clear() {

    }
}