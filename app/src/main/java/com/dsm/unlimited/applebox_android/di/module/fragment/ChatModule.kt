package com.dsm.unlimited.applebox_android.di.module.fragment

import androidx.lifecycle.ViewModelProviders
import com.dsm.unlimited.applebox_android.ui.fragment.ChatFragment
import com.dsm.unlimited.applebox_android.viewmodel.ChatViewModel
import com.dsm.unlimited.applebox_android.viewmodel.ChatViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ChatModule() {

    @Provides
    fun viewModel(factory : ChatViewModelFactory, fragment : ChatFragment) = ViewModelProviders.of(fragment, factory)[ChatViewModel::class.java]

    @Provides
    fun factory() = ChatViewModelFactory()
}