package com.dsm.unlimited.applebox_android.di.module.fragment

import androidx.lifecycle.ViewModelProviders
import com.dsm.unlimited.applebox_android.ui.fragment.MainChatFragment
import com.dsm.unlimited.applebox_android.viewmodel.MainChatViewModel
import com.dsm.unlimited.applebox_android.viewmodel.MainChatViewModelFactory
import dagger.Module
import javax.inject.Inject

@Module
class MainChatModule() {
    @Inject
    fun viewModel(fragment : MainChatFragment, factory : MainChatViewModelFactory) = ViewModelProviders.of(fragment, factory)[MainChatViewModel::class.java]

    @Inject
    fun factory() = MainChatViewModelFactory()
}