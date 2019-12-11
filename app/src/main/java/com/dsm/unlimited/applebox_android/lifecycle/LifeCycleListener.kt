package com.dsm.unlimited.applebox_android.lifecycle

import androidx.lifecycle.Lifecycle

interface LifeCycleListener {
    fun apply(event : Lifecycle.Event)
}