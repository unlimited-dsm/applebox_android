package com.dsm.unlimited.applebox_android.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dsm.unlimited.applebox_android.util.ChatNavigator

class MainChatViewModelFactory(val chatNavigator: ChatNavigator) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T = modelClass.getConstructor(ChatNavigator::class.java).newInstance(chatNavigator)
}