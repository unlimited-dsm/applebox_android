package com.dsm.unlimited.applebox_android.ui.adapter

import androidx.databinding.ViewDataBinding
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.ItemPoliticsTopPosterBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseListAdapter
import com.dsm.unlimited.applebox_android.ui.base.BaseViewHolder
import com.dsm.unlimited.applebox_android.ui.fragment.MainPoliticsFragment
import com.dsm.unlimited.applebox_android.ui.viewholder.MainPoliticsPagerViewHolder
import com.dsm.unlimited.domain.getPoliticsList
import com.dsm.unlimited.domain.valueobject.Politics

class MainPoliticsPagerAdapter(val fragment : MainPoliticsFragment) : BaseListAdapter<Politics>(fragment.context, fragment){
    override val itemList: List<Politics>
        get() = getPoliticsList(10)

    override fun createViewHolder(binding: ViewDataBinding, viewType: Int): BaseViewHolder = MainPoliticsPagerViewHolder(fragment, binding as ItemPoliticsTopPosterBinding)

    override val layoutId: Int
        get() = R.layout.item_politics_top_poster
}