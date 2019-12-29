package com.dsm.unlimited.applebox_android.ui.viewholder

import com.dsm.unlimited.applebox_android.databinding.ItemChatSimpleBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseViewHolder
import com.dsm.unlimited.applebox_android.ui.fragment.MainChatFragment

class MainChatListViewHolder(val fragment : MainChatFragment, val binding : ItemChatSimpleBinding) : BaseViewHolder(binding) {
    override fun bind(position: Int) {
        binding.vm = fragment.viewModel
        binding.lifecycleOwner = fragment
    }
}