package com.dsm.unlimited.applebox_android.ui.adapter

import androidx.databinding.ViewDataBinding
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.ItemPoliticsPosterBinding
import com.dsm.unlimited.applebox_android.databinding.ItemTopPosterBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseBannerListAdapter
import com.dsm.unlimited.applebox_android.ui.base.BaseViewHolder
import com.dsm.unlimited.applebox_android.ui.fragment.MainPoliticsFragment
import com.dsm.unlimited.applebox_android.ui.viewholder.MainPoliticsBannerViewHolder
import com.dsm.unlimited.applebox_android.ui.viewholder.MainPoliticsPosterViewHolder
import com.dsm.unlimited.domain.getPoliticsList
import com.dsm.unlimited.domain.valueobject.Politics

class MainPoliticsAdapter(val fragment : MainPoliticsFragment) : BaseBannerListAdapter<List<Politics>, Politics>(fragment.context, fragment) {

    override val bannerItem: List<Politics>
        get() = getPoliticsList(10)

    override val bannerLayout: Int
        get() = R.layout.item_top_poster

    override val itemLayout: Int
        get() = R.layout.item_politics_poster

    override val itemList: List<Politics>
        get() = getPoliticsList(10)

    override fun createViewHolder(binding: ViewDataBinding): BaseViewHolder
        = if(binding is ItemTopPosterBinding) MainPoliticsBannerViewHolder(fragment, binding) else MainPoliticsPosterViewHolder(fragment, binding as ItemPoliticsPosterBinding)
}