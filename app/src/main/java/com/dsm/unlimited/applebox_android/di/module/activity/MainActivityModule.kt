package com.dsm.unlimited.applebox_android.di.module.activity

import com.dsm.unlimited.applebox_android.di.module.fragment.MainFragmentModule
import com.dsm.unlimited.applebox_android.di.scope.ActivityScope
import com.dsm.unlimited.applebox_android.di.scope.FragmentScope
import com.dsm.unlimited.applebox_android.ui.fragment.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule() {
    @FragmentScope
    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun mainFragment() : MainFragment

}