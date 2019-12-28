package com.dsm.unlimited.applebox_android.di.module.fragment

import androidx.lifecycle.ViewModelProviders
import com.dsm.unlimited.applebox_android.ui.fragment.HomeWritePosterFragment
import com.dsm.unlimited.applebox_android.viewmodel.HomeWritePosterViewModel
import com.dsm.unlimited.applebox_android.viewmodel.HomeWritePosterViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class HomeWritePosterModule() {
    @Provides
    fun viewModel(fragment : HomeWritePosterFragment, factory : HomeWritePosterViewModelFactory) = ViewModelProviders.of(fragment, factory)[HomeWritePosterViewModel::class.java]

    @Provides
    fun factory() = HomeWritePosterViewModelFactory()
}