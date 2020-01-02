package com.dsm.unlimited.applebox_android.ui.viewholder

import com.dsm.unlimited.applebox_android.databinding.ItemProfileBannerBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseViewHolder
import com.dsm.unlimited.applebox_android.ui.fragment.MainProfileFragment

class MainProfileBannerViewHolder(val fragment : MainProfileFragment, val binding : ItemProfileBannerBinding) : BaseViewHolder(binding){
    override fun bind(position: Int) {
        binding.lifecycleOwner = fragment
        binding.vm = fragment.viewModel
    }
}