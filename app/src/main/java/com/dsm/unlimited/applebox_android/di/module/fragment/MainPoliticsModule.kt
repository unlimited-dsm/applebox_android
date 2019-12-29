package com.dsm.unlimited.applebox_android.di.module.fragment

import androidx.lifecycle.ViewModelProviders
import com.dsm.unlimited.applebox_android.ui.fragment.MainPoliticsFragment
import com.dsm.unlimited.applebox_android.util.PoliticsNavigator
import com.dsm.unlimited.applebox_android.viewmodel.MainPoliticsViewModel
import com.dsm.unlimited.applebox_android.viewmodel.MainPoliticsViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MainPoliticsModule() {
    @Provides
    fun viewModel(fragment : MainPoliticsFragment, factory : MainPoliticsViewModelFactory) = ViewModelProviders.of(fragment, factory)[MainPoliticsViewModel::class.java]

    @Provides
    fun factory(politicsNavigator: PoliticsNavigator) = MainPoliticsViewModelFactory(politicsNavigator)

    @Provides
    fun politicsNavigator(fragment: MainPoliticsFragment) : PoliticsNavigator = fragment
}