package com.dsm.unlimited.applebox_android.ui.adapter

import androidx.databinding.ViewDataBinding
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.ItemChatSimpleBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseListAdapter
import com.dsm.unlimited.applebox_android.ui.fragment.MainChatFragment
import com.dsm.unlimited.applebox_android.ui.viewholder.MainChatListViewHolder
import com.dsm.unlimited.domain.getSimpleChatList
import com.dsm.unlimited.domain.valueobject.SimpleChat

class MainChatListAdapter(val fragment : MainChatFragment) : BaseListAdapter<SimpleChat>(fragment.context, fragment) {

    override val itemList: List<SimpleChat>
        get() = getSimpleChatList(10)

    override val layoutId: Int
        get() = R.layout.item_chat_simple

    override fun createViewHolder(binding: ViewDataBinding, viewType: Int): MainChatListViewHolder
            = MainChatListViewHolder(fragment, binding as ItemChatSimpleBinding)
}