package com.dsm.unlimited.applebox_android.ui.adapter

import androidx.databinding.ViewDataBinding
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.ItemHomeReadPosterBinding
import com.dsm.unlimited.applebox_android.databinding.ItemPosterCommentBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseBannerListAdapter
import com.dsm.unlimited.applebox_android.ui.base.BaseViewHolder
import com.dsm.unlimited.applebox_android.ui.fragment.HomeReadPosterFragment
import com.dsm.unlimited.applebox_android.ui.viewholder.HomeReadPosterCommentViewHolder
import com.dsm.unlimited.applebox_android.ui.viewholder.HomeReadPosterViewHolder
import com.dsm.unlimited.domain.getCommentList
import com.dsm.unlimited.domain.getPoster
import com.dsm.unlimited.domain.valueobject.Comment
import com.dsm.unlimited.domain.valueobject.Poster

class HomeReadPosterAdapter(val fragment : HomeReadPosterFragment) : BaseBannerListAdapter<Poster, Comment>(fragment.context, fragment) {
    override val bannerItem: Poster
        get() = getPoster()

    override val bannerLayout: Int
        get() = R.layout.item_home_read_poster

    override val itemLayout: Int
        get() = R.layout.item_poster_comment

    override val itemList: List<Comment>
        get() = getCommentList(10)

    override fun createViewHolder(binding: ViewDataBinding): BaseViewHolder = if(binding is ItemHomeReadPosterBinding) HomeReadPosterViewHolder(binding) else HomeReadPosterCommentViewHolder(binding as ItemPosterCommentBinding)
}