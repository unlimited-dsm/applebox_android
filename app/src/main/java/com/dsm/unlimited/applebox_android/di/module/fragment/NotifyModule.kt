package com.dsm.unlimited.applebox_android.di.module.fragment

import androidx.lifecycle.ViewModelProviders
import com.dsm.unlimited.applebox_android.ui.fragment.NotifyFragment
import com.dsm.unlimited.applebox_android.util.BackNavigator
import com.dsm.unlimited.applebox_android.viewmodel.NotifyViewModel
import com.dsm.unlimited.applebox_android.viewmodel.NotifyViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class NotifyModule() {
    @Provides
    fun viewModel(factory : NotifyViewModelFactory, fragment : NotifyFragment) = ViewModelProviders.of(fragment, factory)[NotifyViewModel::class.java]

    @Provides
    fun factory(backNavigator: BackNavigator) = NotifyViewModelFactory(backNavigator)

    @Provides
    fun backNavigator(fragment: NotifyFragment) : BackNavigator = fragment
}