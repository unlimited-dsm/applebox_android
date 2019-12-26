package com.dsm.unlimited.applebox_android.ui.fragment

import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.FragmentChattingBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseFragment
import com.dsm.unlimited.applebox_android.viewmodel.ChatViewModel
import javax.inject.Inject

class ChatFragment() : BaseFragment<FragmentChattingBinding>() {
    override val layout: Int
        get() = R.layout.fragment_chatting

    @Inject
    override lateinit var viewModel: ChatViewModel
}