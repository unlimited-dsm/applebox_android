package com.dsm.unlimited.applebox_android.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.FragmentHomeReadPosterBinding
import com.dsm.unlimited.applebox_android.ui.adapter.HomeReadPosterAdapter
import com.dsm.unlimited.applebox_android.ui.base.BaseFragment
import com.dsm.unlimited.applebox_android.viewmodel.HomePosterViewModel
import javax.inject.Inject

class HomeReadPosterFragment() : BaseFragment<FragmentHomeReadPosterBinding>() {
    override val layout: Int
        get() = R.layout.fragment_home_read_poster

    @Inject
    override lateinit var viewModel: HomePosterViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.homeReadPosterRecyclerView.apply {
            adapter = HomeReadPosterAdapter(this@HomeReadPosterFragment)
            layoutManager = LinearLayoutManager(this.context)
        }
    }
}