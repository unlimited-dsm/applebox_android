package com.dsm.unlimited.applebox_android.ui.viewholder

import com.dsm.unlimited.applebox_android.databinding.ItemProfilePosterBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseViewHolder
import com.dsm.unlimited.applebox_android.ui.fragment.MainProfileFragment

class MainProfilePosterViewHolder(val fragment: MainProfileFragment, val binding: ItemProfilePosterBinding) : BaseViewHolder(binding) {
    override fun bind(position: Int) {
        binding.vm = fragment.viewModel
        binding.lifecycleOwner = fragment
    }
}