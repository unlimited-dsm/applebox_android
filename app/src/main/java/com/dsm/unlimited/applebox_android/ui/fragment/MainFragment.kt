package com.dsm.unlimited.applebox_android.ui.fragment

import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.FragmentMainBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseFragment
import com.dsm.unlimited.applebox_android.viewmodel.MainViewModel
import com.dsm.unlimited.applebox_android.viewmodel.base.BaseViewModel
import javax.inject.Inject

class MainFragment() : BaseFragment<FragmentMainBinding>() {
    override val layout: Int
        get() = R.layout.fragment_main

    @Inject
    override lateinit var viewModel: MainViewModel
}