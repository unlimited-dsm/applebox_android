package com.dsm.unlimited.applebox_android.di.module.fragment

import androidx.lifecycle.ViewModelProviders
import com.dsm.unlimited.applebox_android.ui.fragment.PoliticsReadPosterFragment
import com.dsm.unlimited.applebox_android.util.BackNavigator
import com.dsm.unlimited.applebox_android.viewmodel.PoliticsReadPosterViewModel
import com.dsm.unlimited.applebox_android.viewmodel.PoliticsReadPosterViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class PoliticsReadPosterModule() {
    @Provides
    fun viewModel(fragment : PoliticsReadPosterFragment, factory: PoliticsReadPosterViewModelFactory) = ViewModelProviders.of(fragment, factory)[PoliticsReadPosterViewModel::class.java]

    @Provides
    fun factory(backNavigator: BackNavigator) = PoliticsReadPosterViewModelFactory(backNavigator)

    @Provides
    fun backNavigator(fragment: PoliticsReadPosterFragment) : BackNavigator = fragment
}