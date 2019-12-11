package com.dsm.unlimited.applebox_android.di.module

import android.content.Context
import com.dsm.unlimited.applebox_android.di.application.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun application(application : BaseApplication) = application

    @Provides
    @Singleton
    fun context(application : BaseApplication) = application as Context
}