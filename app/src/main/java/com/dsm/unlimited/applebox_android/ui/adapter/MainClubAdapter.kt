package com.dsm.unlimited.applebox_android.ui.adapter

import androidx.databinding.ViewDataBinding
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.ItemClubBannerBinding
import com.dsm.unlimited.applebox_android.databinding.ItemClubChannelBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseBannerListAdapter
import com.dsm.unlimited.applebox_android.ui.base.BaseViewHolder
import com.dsm.unlimited.applebox_android.ui.fragment.MainClubFragment
import com.dsm.unlimited.applebox_android.ui.viewholder.MainClubBannerViewHolder
import com.dsm.unlimited.applebox_android.ui.viewholder.MainClubChannelViewHolder
import com.dsm.unlimited.domain.getChannelList
import com.dsm.unlimited.domain.getClub
import com.dsm.unlimited.domain.valueobject.Channel
import com.dsm.unlimited.domain.valueobject.Club

class MainClubAdapter(val fragment : MainClubFragment) : BaseBannerListAdapter<Club, Channel>(fragment.context, fragment) {

    override val bannerItem: Club
        get() = getClub()

    override val bannerLayout: Int
        get() = R.layout.item_club_banner

    override val itemLayout: Int
        get() = R.layout.item_club_channel

    override val itemList: List<Channel>
        get() = getChannelList(10)

    override fun createViewHolder(binding: ViewDataBinding): BaseViewHolder
            = if(binding is ItemClubBannerBinding) MainClubBannerViewHolder(fragment, binding) else MainClubChannelViewHolder(fragment, binding as ItemClubChannelBinding)
}