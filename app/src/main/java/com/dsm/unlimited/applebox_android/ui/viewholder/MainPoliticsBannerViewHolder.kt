package com.dsm.unlimited.applebox_android.ui.viewholder

import com.dsm.unlimited.applebox_android.customview.setViewPager
import com.dsm.unlimited.applebox_android.databinding.ItemTopPosterBinding
import com.dsm.unlimited.applebox_android.ui.adapter.MainPoliticsPagerAdapter
import com.dsm.unlimited.applebox_android.ui.base.BaseViewHolder
import com.dsm.unlimited.applebox_android.ui.fragment.MainPoliticsFragment

class MainPoliticsBannerViewHolder(val fragment : MainPoliticsFragment, val binding : ItemTopPosterBinding) : BaseViewHolder(binding) {
    override fun bind(position: Int) {
        binding.mainBannerViewPager.setViewPager(MainPoliticsPagerAdapter(fragment))
    }
}