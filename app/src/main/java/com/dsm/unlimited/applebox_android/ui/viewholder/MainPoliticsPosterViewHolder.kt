package com.dsm.unlimited.applebox_android.ui.viewholder

import com.dsm.unlimited.applebox_android.databinding.ItemPoliticsPosterBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseViewHolder
import com.dsm.unlimited.applebox_android.ui.fragment.MainPoliticsFragment

class MainPoliticsPosterViewHolder(val fragment : MainPoliticsFragment, val binding : ItemPoliticsPosterBinding) : BaseViewHolder(binding) {
    override fun bind(position: Int) {
        binding.vm = fragment.viewModel
        binding.lifecycleOwner = fragment
    }
}