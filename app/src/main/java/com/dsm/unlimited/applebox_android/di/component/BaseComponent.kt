package com.dsm.unlimited.applebox_android.di.component

import com.dsm.unlimited.applebox_android.di.application.BaseApplication
import com.dsm.unlimited.applebox_android.di.module.ActivityModule
import com.dsm.unlimited.applebox_android.di.module.ApiModule
import com.dsm.unlimited.applebox_android.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
    AndroidInjectionModule::class,
    AppModule::class,
    ActivityModule::class,
    ApiModule::class
))
interface BaseComponent : AndroidInjector<BaseApplication> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application : BaseApplication) : BaseComponent
    }
}