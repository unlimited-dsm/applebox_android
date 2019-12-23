package com.dsm.unlimited.applebox_android.ui.viewholder

import com.dsm.unlimited.applebox_android.customview.setViewPager
import com.dsm.unlimited.applebox_android.databinding.ItemTopPosterBinding
import com.dsm.unlimited.applebox_android.ui.adapter.MainHomePagerAdapter
import com.dsm.unlimited.applebox_android.ui.base.BaseViewHolder
import com.dsm.unlimited.applebox_android.ui.fragment.MainHomeFragment

class MainHomeBannerViewHolder(val fragment : MainHomeFragment, val binding : ItemTopPosterBinding) : BaseViewHolder(binding) {
    override fun bind(position: Int) {
        binding.mainBannerViewPager.setViewPager(MainHomePagerAdapter(fragment))
    }
}