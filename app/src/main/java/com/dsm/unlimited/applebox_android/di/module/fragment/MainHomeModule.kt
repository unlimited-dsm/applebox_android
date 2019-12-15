package com.dsm.unlimited.applebox_android.di.module.fragment

import androidx.lifecycle.ViewModelProviders
import com.dsm.unlimited.applebox_android.ui.fragment.MainHomeFragment
import com.dsm.unlimited.applebox_android.viewmodel.MainHomeViewModel
import com.dsm.unlimited.applebox_android.viewmodel.MainHomeViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MainHomeModule() {
    @Provides
    fun viewModel(fragment : MainHomeFragment, factory : MainHomeViewModelFactory) = ViewModelProviders.of(fragment, factory)[MainHomeViewModel::class.java]

    @Provides
    fun factory() = MainHomeViewModel()
}