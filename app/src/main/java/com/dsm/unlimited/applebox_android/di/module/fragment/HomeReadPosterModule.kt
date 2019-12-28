package com.dsm.unlimited.applebox_android.di.module.fragment

import androidx.lifecycle.ViewModelProviders
import com.dsm.unlimited.applebox_android.ui.fragment.HomeReadPosterFragment
import com.dsm.unlimited.applebox_android.viewmodel.HomePosterViewModel
import com.dsm.unlimited.applebox_android.viewmodel.HomePosterViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class HomeReadPosterModule {
    @Provides
    fun viewModel(fragment : HomeReadPosterFragment, factory : HomePosterViewModelFactory) = ViewModelProviders.of(fragment, factory)[HomePosterViewModel::class.java]

    @Provides
    fun factory() = HomePosterViewModelFactory()
}