package com.dsm.unlimited.applebox_android.ui.fragment

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.FragmentMainProfileBinding
import com.dsm.unlimited.applebox_android.ui.adapter.MainProfileAdapter
import com.dsm.unlimited.applebox_android.ui.base.BaseFragment
import com.dsm.unlimited.applebox_android.viewmodel.MainProfileViewModel
import org.jetbrains.anko.toolbar
import javax.inject.Inject

class MainProfileFragment() : BaseFragment<FragmentMainProfileBinding>() {
    override val layout: Int
        get() = R.layout.fragment_main_profile

    @Inject
    override lateinit var viewModel: MainProfileViewModel

    @Inject
    lateinit var mainFragment: MainFragment

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.vm = viewModel
        binding.mainProfilePosterRecyclerview.apply {
            adapter = MainProfileAdapter(this@MainProfileFragment)
            layoutManager = LinearLayoutManager(this.context)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        menu.findItem(R.id.main_profile_notify_iv).setOnMenuItemClickListener {
            mainFragment.navigateToNotify()
            true
        }
    }
}