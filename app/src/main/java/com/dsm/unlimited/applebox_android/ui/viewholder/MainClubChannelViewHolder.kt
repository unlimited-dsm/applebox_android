package com.dsm.unlimited.applebox_android.ui.viewholder

import com.dsm.unlimited.applebox_android.databinding.ItemClubChannelBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseViewHolder
import com.dsm.unlimited.applebox_android.ui.fragment.MainClubFragment

class MainClubChannelViewHolder(val fragment : MainClubFragment, val binding : ItemClubChannelBinding) : BaseViewHolder(binding) {
    override fun bind(position: Int) {
        binding.vm = fragment.viewModel
        binding.lifecycleOwner = fragment
        binding.clubChannelChannelSpinner.bringToFront()
    }
}