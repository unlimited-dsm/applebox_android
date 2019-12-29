package com.dsm.unlimited.applebox_android.di.module.fragment

import androidx.lifecycle.ViewModelProviders
import com.dsm.unlimited.applebox_android.ui.fragment.PoliticsWritePosterFragment
import com.dsm.unlimited.applebox_android.util.BackNavigator
import com.dsm.unlimited.applebox_android.viewmodel.PoliticsWritePosterViewModel
import com.dsm.unlimited.applebox_android.viewmodel.PoliticsWritePosterViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class PoliticsWritePosterModule() {
    @Provides
    fun viewModel(fragment : PoliticsWritePosterFragment, factory : PoliticsWritePosterViewModelFactory) = ViewModelProviders.of(fragment, factory)[PoliticsWritePosterViewModel::class.java]

    @Provides
    fun factory(backNavigator: BackNavigator) = PoliticsWritePosterViewModelFactory(backNavigator)

    @Provides
    fun backNavigator(fragment: PoliticsWritePosterFragment) : BackNavigator = fragment
}