package com.dsm.unlimited.applebox_android.di.module.activity

import androidx.lifecycle.ViewModelProviders
import com.dsm.unlimited.applebox_android.di.module.fragment.MainFragmentModule
import com.dsm.unlimited.applebox_android.di.module.fragment.NotifyModule
import com.dsm.unlimited.applebox_android.di.scope.FragmentScope
import com.dsm.unlimited.applebox_android.ui.activity.MainActivity
import com.dsm.unlimited.applebox_android.ui.fragment.MainFragment
import com.dsm.unlimited.applebox_android.ui.fragment.NotifyFragment
import com.dsm.unlimited.applebox_android.viewmodel.ActivityViewModel
import com.dsm.unlimited.applebox_android.viewmodel.ActivityViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module(includes = [ActivityInjectModule::class])
abstract class MainActivityModule() {
    @FragmentScope
    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun mainFragment() : MainFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [NotifyModule::class])
    abstract fun notifyFragment() : NotifyFragment
}

@Module
class ActivityInjectModule() {
    @Provides
    fun viewModel(activity : MainActivity, factory : ActivityViewModelFactory) : ActivityViewModel = ViewModelProviders.of(activity, factory)[ActivityViewModel::class.java]

    @Provides
    fun factory() : ActivityViewModelFactory = ActivityViewModelFactory()
}