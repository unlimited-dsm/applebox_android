package com.dsm.unlimited.applebox_android.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.FragmentMainHomeBinding
import com.dsm.unlimited.applebox_android.ui.adapter.MainHomeAdapter
import com.dsm.unlimited.applebox_android.ui.base.BaseFragment
import com.dsm.unlimited.applebox_android.util.HomeNavigator
import com.dsm.unlimited.applebox_android.viewmodel.MainHomeViewModel
import javax.inject.Inject

class MainHomeFragment() : BaseFragment<FragmentMainHomeBinding>(), HomeNavigator {
    override val layout: Int
        get() = R.layout.fragment_main_home

    @Inject
    override lateinit var viewModel: MainHomeViewModel

    @Inject
    lateinit var mainFragment : MainFragment

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.vm = viewModel
        binding.mainHomePosterRecyclerview.apply {
            adapter = MainHomeAdapter(this@MainHomeFragment)
            layoutManager = LinearLayoutManager(this.context)
        }
    }

    override fun navigateReadPoster() {
        NavHostFragment.findNavController(mainFragment).navigate(R.id.action_mainFragment_to_homePosterFragment)
    }

    override fun navigateWritePoster() {
        NavHostFragment.findNavController(mainFragment).navigate(R.id.action_mainFragment_to_homeWritePosterFragment)

    }
}