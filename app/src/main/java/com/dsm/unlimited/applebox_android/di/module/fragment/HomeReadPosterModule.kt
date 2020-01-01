package com.dsm.unlimited.applebox_android.di.module.fragment

import androidx.lifecycle.ViewModelProviders
import com.dsm.unlimited.applebox_android.ui.fragment.HomeReadPosterFragment
import com.dsm.unlimited.applebox_android.util.BackNavigator
import com.dsm.unlimited.applebox_android.viewmodel.HomeReadPosterViewModel
import com.dsm.unlimited.applebox_android.viewmodel.HomeReadPosterViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class HomeReadPosterModule {
    @Provides
    fun viewModel(fragment : HomeReadPosterFragment, factory : HomeReadPosterViewModelFactory) = ViewModelProviders.of(fragment, factory)[HomeReadPosterViewModel::class.java]

    @Provides
    fun factory(backNavigator: BackNavigator) = HomeReadPosterViewModelFactory(backNavigator)

    @Provides
    fun backNavigator(fragment: HomeReadPosterFragment) : BackNavigator = fragment
}