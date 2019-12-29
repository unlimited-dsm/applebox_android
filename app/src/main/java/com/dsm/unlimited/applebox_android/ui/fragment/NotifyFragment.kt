package com.dsm.unlimited.applebox_android.ui.fragment

import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.FragmentProfileNotifyBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseFragment
import com.dsm.unlimited.applebox_android.viewmodel.NotifyViewModel
import javax.inject.Inject

class NotifyFragment() : BaseFragment<FragmentProfileNotifyBinding>() {
    override val layout: Int
        get() = R.layout.fragment_profile_notify

    @Inject
    override lateinit var viewModel: NotifyViewModel
}