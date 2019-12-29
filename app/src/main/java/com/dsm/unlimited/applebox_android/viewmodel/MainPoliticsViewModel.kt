package com.dsm.unlimited.applebox_android.viewmodel

import androidx.lifecycle.Lifecycle
import com.dsm.unlimited.applebox_android.util.PoliticsNavigator
import com.dsm.unlimited.applebox_android.viewmodel.base.BaseViewModel

class MainPoliticsViewModel(val politicsNavigator: PoliticsNavigator) : BaseViewModel() {
    override fun apply(event: Lifecycle.Event) {

    }

    override fun clear() {

    }

    fun readPolitics() = politicsNavigator.readPolitics()

    fun writePolitics() = politicsNavigator.writePolitics()

    fun search() {

    }
}