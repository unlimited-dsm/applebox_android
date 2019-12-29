package com.dsm.unlimited.applebox_android.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.FragmentChattingBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseFragment
import com.dsm.unlimited.applebox_android.util.BackNavigator
import com.dsm.unlimited.applebox_android.viewmodel.ChatViewModel
import javax.inject.Inject

class ChatFragment() : BaseFragment<FragmentChattingBinding>(), BackNavigator {
    override val layout: Int
        get() = R.layout.fragment_chatting

    @Inject
    override lateinit var viewModel: ChatViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.vm = viewModel
    }

    override fun backNavigate() = NavHostFragment.findNavController(this).navigateUp()
}