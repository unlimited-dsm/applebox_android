package com.dsm.unlimited.applebox_android.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.FragmentHomeReadPosterBinding
import com.dsm.unlimited.applebox_android.ui.adapter.HomeReadPosterAdapter
import com.dsm.unlimited.applebox_android.ui.base.BaseFragment
import com.dsm.unlimited.applebox_android.util.BackNavigator
import com.dsm.unlimited.applebox_android.viewmodel.HomeReadPosterViewModel
import javax.inject.Inject

class HomeReadPosterFragment() : BaseFragment<FragmentHomeReadPosterBinding>(), BackNavigator {
    override val layout: Int
        get() = R.layout.fragment_home_read_poster

    @Inject
    override lateinit var viewModel: HomeReadPosterViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.vm = viewModel
        binding.homeReadPosterRecyclerView.apply {
            adapter = HomeReadPosterAdapter(this@HomeReadPosterFragment)
            layoutManager = LinearLayoutManager(this.context)
        }
    }

    override fun backNavigate() = NavHostFragment.findNavController(this).navigateUp()
}