package com.dsm.unlimited.applebox_android.di.module

import com.dsm.unlimited.applebox_android.di.module.activity.MainActivityModule
import com.dsm.unlimited.applebox_android.di.scope.ActivityScope
import com.dsm.unlimited.applebox_android.ui.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule() {

    @ActivityScope
    @ContributesAndroidInjector(modules = [
        MainActivityModule::class
    ])
    abstract fun mainActivity() : MainActivity
}