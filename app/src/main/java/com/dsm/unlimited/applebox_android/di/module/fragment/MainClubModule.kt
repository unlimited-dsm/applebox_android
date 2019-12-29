package com.dsm.unlimited.applebox_android.di.module.fragment

import androidx.lifecycle.ViewModelProviders
import com.dsm.unlimited.applebox_android.ui.fragment.MainClubFragment
import com.dsm.unlimited.applebox_android.util.ChannelNavigator
import com.dsm.unlimited.applebox_android.viewmodel.MainClubViewModel
import com.dsm.unlimited.applebox_android.viewmodel.MainClubViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MainClubModule() {
    @Provides
    fun viewModel(fragment : MainClubFragment, factory : MainClubViewModelFactory) = ViewModelProviders.of(fragment, factory)[MainClubViewModel::class.java]

    @Provides
    fun factory(channelNavigator: ChannelNavigator) = MainClubViewModelFactory(channelNavigator)

    @Provides
    fun channelNavigator(fragment: MainClubFragment) : ChannelNavigator = fragment
}