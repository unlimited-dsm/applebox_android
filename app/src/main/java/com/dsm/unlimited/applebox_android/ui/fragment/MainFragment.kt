package com.dsm.unlimited.applebox_android.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.customview.setBadge
import com.dsm.unlimited.applebox_android.databinding.FragmentMainBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseFragment
import com.dsm.unlimited.applebox_android.viewmodel.MainViewModel
import javax.inject.Inject

class MainFragment() : BaseFragment<FragmentMainBinding>() {
    override val layout: Int
        get() = R.layout.fragment_main

    @Inject
    override lateinit var viewModel: MainViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.vm = viewModel
        NavigationUI.setupWithNavController(
            binding.mainBottomNavigationView,
            Navigation.findNavController(view.findViewById(R.id.main_menu_fragment))
        )
    }

    fun navigateToNotify() = NavHostFragment.findNavController(this).navigate(R.id.action_mainFragment_to_notifyFragment)
}