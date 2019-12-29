package com.dsm.unlimited.applebox_android.di.module.fragment

import androidx.lifecycle.ViewModelProviders
import com.dsm.unlimited.applebox_android.ui.fragment.MainProfileFragment
import com.dsm.unlimited.applebox_android.util.ProfileNavigator
import com.dsm.unlimited.applebox_android.viewmodel.MainProfileViewModel
import com.dsm.unlimited.applebox_android.viewmodel.MainProfileViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MainProfileModule() {
    @Provides
    fun viewModel(fragment : MainProfileFragment, factory : MainProfileViewModelFactory) : MainProfileViewModel = ViewModelProviders.of(fragment,factory)[MainProfileViewModel::class.java]

    @Provides
    fun factory(profileNavigator: ProfileNavigator) = MainProfileViewModelFactory(profileNavigator)

    @Provides
    fun profileNavigator(fragment: MainProfileFragment) : ProfileNavigator = fragment
}