package com.dsm.unlimited.applebox_android.viewmodel.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dsm.unlimited.applebox_android.lifecycle.LifeCycleListener

abstract class BaseViewModel() : ViewModel(), LifeCycleListener {

    protected val _toast = MutableLiveData<String>()
    val toast : LiveData<String> = _toast

    abstract fun clear()
}