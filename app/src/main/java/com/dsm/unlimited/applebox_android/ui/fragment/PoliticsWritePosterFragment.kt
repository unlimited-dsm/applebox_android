package com.dsm.unlimited.applebox_android.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.FragmentPoliticsWritePosterBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseFragment
import com.dsm.unlimited.applebox_android.util.BackNavigator
import com.dsm.unlimited.applebox_android.viewmodel.PoliticsWritePosterViewModel
import javax.inject.Inject

class PoliticsWritePosterFragment() : BaseFragment<FragmentPoliticsWritePosterBinding>(), BackNavigator {
    override val layout: Int
        get() = R.layout.fragment_politics_write_poster

    @Inject
    override lateinit var viewModel: PoliticsWritePosterViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.vm = viewModel
        binding.lifecycleOwner = this
    }

    override fun backNavigate() = NavHostFragment.findNavController(this).navigateUp()
}