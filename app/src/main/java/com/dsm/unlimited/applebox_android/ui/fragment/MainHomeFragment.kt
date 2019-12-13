package com.dsm.unlimited.applebox_android.ui.fragment

import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.FragmentMainHomeBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseFragment
import com.dsm.unlimited.applebox_android.viewmodel.MainHomeViewModel
import javax.inject.Inject

class MainHomeFragment() : BaseFragment<FragmentMainHomeBinding>() {
    override val layout: Int
        get() = R.layout.fragment_main_home

    @Inject
    override lateinit var viewModel: MainHomeViewModel
}