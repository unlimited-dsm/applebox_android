package com.dsm.unlimited.applebox_android.viewmodel

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.MutableLiveData
import com.dsm.unlimited.applebox_android.util.ProfileNavigator
import com.dsm.unlimited.applebox_android.viewmodel.base.BaseViewModel

class MainProfileViewModel(val profileNavigator: ProfileNavigator) : BaseViewModel() {

    val notificationCount = MutableLiveData<Int>()

    val isMyProfile = MutableLiveData<Boolean>(false)

    val isEditMode = MutableLiveData(false)

    override fun apply(event: Lifecycle.Event) {

    }

    override fun clear() {

    }

    fun showNotificate() = profileNavigator.showNotificate()

    fun readPoster() = profileNavigator.readPoster()

    fun editProfile() = isEditMode.postValue(true)

    fun applyEditProfile() {
        isEditMode.postValue(false)
    }

    fun cancelEditProfile() {
        isEditMode.postValue(false)
    }
}