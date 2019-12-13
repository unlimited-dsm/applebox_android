package com.dsm.unlimited.applebox_android.di.module.fragment

import androidx.lifecycle.ViewModelProviders
import com.dsm.unlimited.applebox_android.ui.fragment.MainFragment
import com.dsm.unlimited.applebox_android.ui.fragment.MainPoliticsFragment
import com.dsm.unlimited.applebox_android.viewmodel.MainViewModel
import com.dsm.unlimited.applebox_android.viewmodel.MainViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module(includes = [MainInjectModule::class])
abstract class MainFragmentModule() {

    @ContributesAndroidInjector(modules = [MainPoliticsModule::class])
    abstract fun mainPoliticsFragment() : MainPoliticsFragment
}

@Module
class MainInjectModule() {
    @Provides
    fun viewModel(fragment : MainFragment, factory : MainViewModelFactory) = ViewModelProviders.of(fragment, factory)[MainViewModel::class.java]

    @Provides
    fun factory() = MainViewModelFactory()
}