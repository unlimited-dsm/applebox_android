package com.dsm.unlimited.applebox_android.di.module.activity

import androidx.lifecycle.ViewModelProviders
import com.dsm.unlimited.applebox_android.di.module.fragment.ChannelModule
import com.dsm.unlimited.applebox_android.di.module.fragment.HomeReadPosterModule
import com.dsm.unlimited.applebox_android.di.module.fragment.HomeWritePosterModule
import com.dsm.unlimited.applebox_android.di.module.fragment.MainFragmentModule
import com.dsm.unlimited.applebox_android.di.module.fragment.PoliticsReadPosterModule
import com.dsm.unlimited.applebox_android.di.module.fragment.PoliticsWritePosterModule
import com.dsm.unlimited.applebox_android.di.module.fragment.NotifyModule
import com.dsm.unlimited.applebox_android.di.scope.FragmentScope
import com.dsm.unlimited.applebox_android.ui.activity.MainActivity
import com.dsm.unlimited.applebox_android.ui.fragment.ChannelFragment
import com.dsm.unlimited.applebox_android.ui.fragment.HomeReadPosterFragment
import com.dsm.unlimited.applebox_android.ui.fragment.HomeWritePosterFragment
import com.dsm.unlimited.applebox_android.ui.fragment.MainFragment
import com.dsm.unlimited.applebox_android.ui.fragment.PoliticsReadPosterFragment
import com.dsm.unlimited.applebox_android.ui.fragment.PoliticsWritePosterFragment
import com.dsm.unlimited.applebox_android.ui.fragment.NotifyFragment
import com.dsm.unlimited.applebox_android.viewmodel.ActivityViewModel
import com.dsm.unlimited.applebox_android.viewmodel.ActivityViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module(includes = [ActivityInjectModule::class])
abstract class MainActivityModule() {
    @FragmentScope
    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun mainFragment() : MainFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [ChannelModule::class])
    abstract fun channelFragment() : ChannelFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [PoliticsWritePosterModule::class])
    abstract fun politicsWritePosterFragment() : PoliticsWritePosterFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [PoliticsReadPosterModule::class])
    abstract fun politicsReadPosterFragment() : PoliticsReadPosterFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [HomeReadPosterModule::class])
    abstract fun homeReadPosterFragment() : HomeReadPosterFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [HomeWritePosterModule::class])
    abstract fun headWritePosterFragment() : HomeWritePosterFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [NotifyModule::class])
    abstract fun notifyFragment() : NotifyFragment
}

@Module
class ActivityInjectModule() {
    @Provides
    fun viewModel(activity : MainActivity, factory : ActivityViewModelFactory) : ActivityViewModel = ViewModelProviders.of(activity, factory)[ActivityViewModel::class.java]

    @Provides
    fun factory() : ActivityViewModelFactory = ActivityViewModelFactory()
}