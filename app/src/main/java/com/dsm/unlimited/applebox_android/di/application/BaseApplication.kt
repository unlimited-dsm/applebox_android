package com.dsm.unlimited.applebox_android.di.application

import android.app.Application
import com.dsm.unlimited.applebox_android.di.component.DaggerBaseComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class BaseApplication () : DaggerApplication() {
    var injector : AndroidInjector<out DaggerApplication>? = null
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = injector ?: DaggerBaseComponent.factory().create(this)
}