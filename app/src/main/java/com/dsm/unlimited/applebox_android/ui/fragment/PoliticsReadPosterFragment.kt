package com.dsm.unlimited.applebox_android.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.FragmentPoliticsReadPosterBinding
import com.dsm.unlimited.applebox_android.ui.adapter.PoliticsReadPosterAdapter
import com.dsm.unlimited.applebox_android.ui.base.BaseFragment
import com.dsm.unlimited.applebox_android.util.BackNavigator
import com.dsm.unlimited.applebox_android.viewmodel.PoliticsReadPosterViewModel
import javax.inject.Inject

class PoliticsReadPosterFragment() : BaseFragment<FragmentPoliticsReadPosterBinding>(), BackNavigator {
    override val layout: Int
        get() = R.layout.fragment_politics_read_poster

    @Inject
    override lateinit var viewModel: PoliticsReadPosterViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.vm = viewModel
        binding.lifecycleOwner = this
        binding.politicsReadPosterRecyclerView.apply {
            adapter = PoliticsReadPosterAdapter(this@PoliticsReadPosterFragment)
            layoutManager = LinearLayoutManager(this.context)
        }
    }

    override fun backNavigate() = NavHostFragment.findNavController(this).navigateUp()
}