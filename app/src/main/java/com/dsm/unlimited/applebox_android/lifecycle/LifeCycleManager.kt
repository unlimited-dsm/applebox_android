package com.dsm.unlimited.applebox_android.lifecycle

import androidx.lifecycle.Lifecycle

class LifeCycleManager() {

    val lifeCycleList = ArrayList<LifeCycleListener>()

    fun add(listener: LifeCycleListener) = lifeCycleList.add(listener)

    fun remove(listener: LifeCycleListener) = lifeCycleList.remove(listener)

    fun notify(event : Lifecycle.Event) = lifeCycleList.forEach { it.apply(event) }
}