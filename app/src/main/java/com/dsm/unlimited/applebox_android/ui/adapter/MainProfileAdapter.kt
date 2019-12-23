package com.dsm.unlimited.applebox_android.ui.adapter

import androidx.databinding.ViewDataBinding
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.ItemProfileBannerBinding
import com.dsm.unlimited.applebox_android.databinding.ItemProfilePosterBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseBannerListAdapter
import com.dsm.unlimited.applebox_android.ui.base.BaseViewHolder
import com.dsm.unlimited.applebox_android.ui.fragment.MainProfileFragment
import com.dsm.unlimited.applebox_android.ui.viewholder.MainProfileBannerViewHolder
import com.dsm.unlimited.applebox_android.ui.viewholder.MainProfilePosterViewHolder
import com.dsm.unlimited.domain.getPosterList
import com.dsm.unlimited.domain.getProfile
import com.dsm.unlimited.domain.valueobject.Poster
import com.dsm.unlimited.domain.valueobject.Profile

class MainProfileAdapter(val fragment : MainProfileFragment) : BaseBannerListAdapter<Profile, Poster>(fragment.context, fragment) {
    override val bannerItem: Profile
        get() = getProfile()

    override val bannerLayout: Int
        get() = R.layout.item_profile_banner

    override val itemLayout: Int
        get() = R.layout.item_profile_poster

    override val itemList: List<Poster>
        get() = getPosterList(10)

    override fun createViewHolder(binding: ViewDataBinding): BaseViewHolder
            = if(binding is ItemProfileBannerBinding) MainProfileBannerViewHolder(fragment, binding) else MainProfilePosterViewHolder(fragment, binding as ItemProfilePosterBinding)
}