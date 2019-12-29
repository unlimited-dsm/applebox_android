package com.dsm.unlimited.applebox_android.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.FragmentChannelBinding
import com.dsm.unlimited.applebox_android.ui.adapter.ChannelAdapter
import com.dsm.unlimited.applebox_android.ui.base.BaseFragment
import com.dsm.unlimited.applebox_android.util.BackNavigator
import com.dsm.unlimited.applebox_android.viewmodel.ChannelViewModel
import com.dsm.unlimited.applebox_android.viewmodel.base.BaseViewModel
import javax.inject.Inject

class ChannelFragment() : BaseFragment<FragmentChannelBinding>(), BackNavigator {
    override val layout: Int
        get() = R.layout.fragment_channel

    @Inject
    override lateinit var viewModel: ChannelViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.vm = viewModel
        binding.channelRecyclerview.apply {
            adapter = ChannelAdapter(this@ChannelFragment)
            layoutManager = LinearLayoutManager(this.context)
        }
    }

    override fun backNavigate() = NavHostFragment.findNavController(this).navigateUp()
}