package com.dsm.unlimited.applebox_android.ui.adapter

import androidx.databinding.ViewDataBinding
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.ItemPoliticsCommentBinding
import com.dsm.unlimited.applebox_android.databinding.ItemPoliticsReadPosterBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseBannerListAdapter
import com.dsm.unlimited.applebox_android.ui.base.BaseViewHolder
import com.dsm.unlimited.applebox_android.ui.fragment.PoliticsReadPosterFragment
import com.dsm.unlimited.applebox_android.ui.viewholder.PoliticsReadPosterCommentViewHolder
import com.dsm.unlimited.applebox_android.ui.viewholder.PoliticsReadPosterViewHolder
import com.dsm.unlimited.domain.getCommentList
import com.dsm.unlimited.domain.getPolitics
import com.dsm.unlimited.domain.valueobject.Comment
import com.dsm.unlimited.domain.valueobject.Politics

class PoliticsReadPosterAdapter(val fragment : PoliticsReadPosterFragment) : BaseBannerListAdapter<Politics, Comment>(fragment.context, fragment) {
    override val bannerItem: Politics
        get() = getPolitics()

    override val bannerLayout: Int
        get() = R.layout.item_politics_read_poster

    override val itemLayout: Int
        get() = R.layout.item_politics_comment

    override val itemList: List<Comment>
        get() = getCommentList(10)

    override fun createViewHolder(binding: ViewDataBinding): BaseViewHolder = if(binding is ItemPoliticsReadPosterBinding) PoliticsReadPosterViewHolder(binding) else PoliticsReadPosterCommentViewHolder(binding as ItemPoliticsCommentBinding)
}