package com.dsm.unlimited.applebox_android.ui.fragment

import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.FragmentHomeWritePosterBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseFragment
import com.dsm.unlimited.applebox_android.viewmodel.HomeWritePosterViewModel
import javax.inject.Inject

class HomeWritePosterFragment() : BaseFragment<FragmentHomeWritePosterBinding>() {
    override val layout: Int
        get() = R.layout.fragment_home_write_poster

    @Inject
    override lateinit var viewModel: HomeWritePosterViewModel
}