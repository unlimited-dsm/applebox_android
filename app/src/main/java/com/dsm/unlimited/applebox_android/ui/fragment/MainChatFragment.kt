package com.dsm.unlimited.applebox_android.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.FragmentMainChattingBinding
import com.dsm.unlimited.applebox_android.ui.adapter.MainChatListAdapter
import com.dsm.unlimited.applebox_android.ui.base.BaseFragment
import com.dsm.unlimited.applebox_android.util.ChatNavigator
import com.dsm.unlimited.applebox_android.viewmodel.MainChatViewModel
import javax.inject.Inject

class MainChatFragment() : BaseFragment<FragmentMainChattingBinding>(), ChatNavigator {
    override val layout: Int
        get() = R.layout.fragment_main_chatting

    @Inject
    override lateinit var viewModel: MainChatViewModel
    @Inject
    lateinit var mainFragment: MainFragment

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.mainChatChattingRecyclerview.apply {
            adapter = MainChatListAdapter(this@MainChatFragment)
            layoutManager = LinearLayoutManager(this@MainChatFragment.context)
        }
        binding.vm = viewModel
    }

    override fun chatNavigate() = mainFragment.navigateChatting()
}