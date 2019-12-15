package com.dsm.unlimited.applebox_android.ui.fragment

import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.FragmentMainClubBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseFragment
import com.dsm.unlimited.applebox_android.viewmodel.MainClubViewModel
import com.dsm.unlimited.applebox_android.viewmodel.base.BaseViewModel
import javax.inject.Inject

class MainClubFragment() : BaseFragment<FragmentMainClubBinding>() {
    override val layout: Int
        get() = R.layout.fragment_main_club

    @Inject
    override lateinit var viewModel: MainClubViewModel
}