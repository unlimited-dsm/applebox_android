package com.dsm.unlimited.applebox_android.di.module.fragment

import androidx.lifecycle.ViewModelProviders
import com.dsm.unlimited.applebox_android.di.scope.MenuScope
import com.dsm.unlimited.applebox_android.ui.fragment.MainClubFragment
import com.dsm.unlimited.applebox_android.ui.fragment.MainChatFragment
import com.dsm.unlimited.applebox_android.ui.fragment.MainFragment
import com.dsm.unlimited.applebox_android.ui.fragment.MainProfileFragment
import com.dsm.unlimited.applebox_android.ui.fragment.MainHomeFragment
import com.dsm.unlimited.applebox_android.viewmodel.MainViewModel
import com.dsm.unlimited.applebox_android.viewmodel.MainViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module(includes = [MainInjectModule::class])
abstract class MainFragmentModule() {
    @MenuScope
    @ContributesAndroidInjector(modules = [MainProfileModule::class])
    abstract fun profileFragment() : MainProfileFragment

    @ContributesAndroidInjector(modules = [MainClubModule::class])
    abstract fun mainClubFragment() : MainClubFragment

    @ContributesAndroidInjector(modules = [MainChatModule::class])
    abstract fun mainChatFragment() : MainChatFragment

    @ContributesAndroidInjector(modules = [MainHomeModule::class])
    abstract fun mainHomeFragment() : MainHomeFragment
}

@Module
class MainInjectModule() {
    @Provides
    fun viewModel(fragment : MainFragment, factory : MainViewModelFactory) = ViewModelProviders.of(fragment, factory)[MainViewModel::class.java]

    @Provides
    fun factory() = MainViewModelFactory()
}