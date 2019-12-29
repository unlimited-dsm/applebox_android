package com.dsm.unlimited.applebox_android.di.module.fragment

import androidx.lifecycle.ViewModelProviders
import com.dsm.unlimited.applebox_android.ui.fragment.ChannelFragment
import com.dsm.unlimited.applebox_android.util.BackNavigator
import com.dsm.unlimited.applebox_android.viewmodel.ChannelViewModel
import com.dsm.unlimited.applebox_android.viewmodel.ChannelViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ChannelModule() {

    @Provides
    fun viewModel(fragment : ChannelFragment, factory : ChannelViewModelFactory) = ViewModelProviders.of(fragment, factory)[ChannelViewModel::class.java]

    @Provides
    fun factory(backNavigator: BackNavigator) = ChannelViewModelFactory(backNavigator)

    @Provides
    fun backNavigator(fragment: ChannelFragment) : BackNavigator = fragment
}