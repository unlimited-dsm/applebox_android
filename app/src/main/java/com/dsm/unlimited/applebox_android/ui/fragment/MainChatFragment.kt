package com.dsm.unlimited.applebox_android.ui.fragment

import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.FragmentMainChattingBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseFragment
import com.dsm.unlimited.applebox_android.viewmodel.MainChatViewModel
import javax.inject.Inject

class MainChatFragment() : BaseFragment<FragmentMainChattingBinding>() {
    override val layout: Int
        get() = R.layout.fragment_main_chatting

    @Inject
    override lateinit var viewModel: MainChatViewModel
}