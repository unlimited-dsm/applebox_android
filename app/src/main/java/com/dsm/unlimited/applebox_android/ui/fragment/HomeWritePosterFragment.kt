package com.dsm.unlimited.applebox_android.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.FragmentHomeWritePosterBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseFragment
import com.dsm.unlimited.applebox_android.util.BackNavigator
import com.dsm.unlimited.applebox_android.viewmodel.HomeWritePosterViewModel
import javax.inject.Inject

class HomeWritePosterFragment() : BaseFragment<FragmentHomeWritePosterBinding>(), BackNavigator {
    override val layout: Int
        get() = R.layout.fragment_home_write_poster

    @Inject
    override lateinit var viewModel: HomeWritePosterViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.vm = viewModel
    }

    override fun backNavigate() = NavHostFragment.findNavController(this).navigateUp()
}