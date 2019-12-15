package com.dsm.unlimited.applebox_android.ui.fragment

import android.os.Bundle
import android.view.View
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.FragmentMainProfileBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseFragment
import com.dsm.unlimited.applebox_android.viewmodel.MainProfileViewModel
import javax.inject.Inject

class MainProfileFragment() : BaseFragment<FragmentMainProfileBinding>() {
    override val layout: Int
        get() = R.layout.fragment_main_profile

    @Inject
    override lateinit var viewModel: MainProfileViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.vm = viewModel
    }
}