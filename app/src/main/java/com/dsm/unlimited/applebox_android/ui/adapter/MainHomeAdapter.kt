package com.dsm.unlimited.applebox_android.ui.adapter

import androidx.databinding.ViewDataBinding
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.ItemHomePosterBinding
import com.dsm.unlimited.applebox_android.databinding.ItemTopPosterBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseBannerListAdapter
import com.dsm.unlimited.applebox_android.ui.base.BaseViewHolder
import com.dsm.unlimited.applebox_android.ui.fragment.MainHomeFragment
import com.dsm.unlimited.applebox_android.ui.viewholder.MainHomeBannerViewHolder
import com.dsm.unlimited.applebox_android.ui.viewholder.MainHomePosterViewHolder
import com.dsm.unlimited.domain.getPosterList
import com.dsm.unlimited.domain.valueobject.Poster

class MainHomeAdapter(val fragment : MainHomeFragment) : BaseBannerListAdapter<List<Poster>, Poster>(fragment.context, fragment) {

    override val bannerItem: List<Poster>
        get() = getPosterList(10)

    override val bannerLayout: Int
        get() = R.layout.item_top_poster

    override val itemLayout: Int
        get() = R.layout.item_home_poster

    override val itemList: List<Poster>
        get() = getPosterList(10)

    override fun createViewHolder(binding: ViewDataBinding): BaseViewHolder
        = if(binding is ItemTopPosterBinding) MainHomeBannerViewHolder(fragment, binding) else MainHomePosterViewHolder(fragment, binding as ItemHomePosterBinding)
}