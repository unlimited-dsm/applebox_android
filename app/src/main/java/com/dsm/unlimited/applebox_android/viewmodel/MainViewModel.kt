package com.dsm.unlimited.applebox_android.viewmodel

import androidx.lifecycle.Lifecycle
import com.dsm.unlimited.applebox_android.viewmodel.base.BaseViewModel

class MainViewModel() : BaseViewModel() {

    val badgeInfo = arrayOfNulls<String>(5)

    override fun clear() {

    }

    override fun apply(event: Lifecycle.Event) {

    }
}