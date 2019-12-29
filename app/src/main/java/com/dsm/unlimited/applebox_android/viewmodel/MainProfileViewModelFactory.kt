package com.dsm.unlimited.applebox_android.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dsm.unlimited.applebox_android.util.ProfileNavigator

class MainProfileViewModelFactory(val profileNavigator: ProfileNavigator) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T = modelClass.getConstructor(ProfileNavigator::class.java).newInstance(profileNavigator)
}