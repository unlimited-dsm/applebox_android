package com.dsm.unlimited.applebox_android.di.module.fragment

import androidx.lifecycle.ViewModelProviders
import com.dsm.unlimited.applebox_android.ui.fragment.MainChatFragment
import com.dsm.unlimited.applebox_android.util.ChatNavigator
import com.dsm.unlimited.applebox_android.viewmodel.MainChatViewModel
import com.dsm.unlimited.applebox_android.viewmodel.MainChatViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MainChatModule() {
    @Provides
    fun viewModel(fragment : MainChatFragment, factory : MainChatViewModelFactory) = ViewModelProviders.of(fragment, factory)[MainChatViewModel::class.java]

    @Provides
    fun factory(chatNavigator: ChatNavigator) = MainChatViewModelFactory(chatNavigator)

    @Provides
    fun chatNavigator(fragment : MainChatFragment) : ChatNavigator = fragment
}