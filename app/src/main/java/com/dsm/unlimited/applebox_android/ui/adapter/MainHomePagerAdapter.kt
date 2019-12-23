package com.dsm.unlimited.applebox_android.ui.adapter

import androidx.databinding.ViewDataBinding
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.ItemHomeTopPosterBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseListAdapter
import com.dsm.unlimited.applebox_android.ui.base.BaseViewHolder
import com.dsm.unlimited.applebox_android.ui.fragment.MainHomeFragment
import com.dsm.unlimited.applebox_android.ui.viewholder.MainHomePagerViewHolder
import com.dsm.unlimited.domain.getPosterList
import com.dsm.unlimited.domain.valueobject.Poster

class MainHomePagerAdapter(val fragment : MainHomeFragment) : BaseListAdapter<Poster>(fragment.context, fragment) {

    override val itemList: List<Poster>
        get() = getPosterList(10)

    override val layoutId: Int
        get() = R.layout.item_home_top_poster

    override fun createViewHolder(binding: ViewDataBinding, viewType: Int): BaseViewHolder
        = MainHomePagerViewHolder(fragment, binding as ItemHomeTopPosterBinding)
}