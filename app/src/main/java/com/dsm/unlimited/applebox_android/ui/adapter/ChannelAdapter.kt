package com.dsm.unlimited.applebox_android.ui.adapter

import androidx.databinding.ViewDataBinding
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.ItemChannelChattingBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseListAdapter
import com.dsm.unlimited.applebox_android.ui.base.BaseViewHolder
import com.dsm.unlimited.applebox_android.ui.fragment.ChannelFragment
import com.dsm.unlimited.applebox_android.ui.viewholder.ChannelViewHolder
import com.dsm.unlimited.domain.getChannelChattingList
import com.dsm.unlimited.domain.valueobject.ChannelChatting

class ChannelAdapter(val fragment : ChannelFragment) : BaseListAdapter<ChannelChatting>(fragment.context, fragment) {
    override val itemList: List<ChannelChatting>
        get() = getChannelChattingList(10)

    override val layoutId: Int
        get() = R.layout.item_channel_chatting

    override fun createViewHolder(binding: ViewDataBinding, viewType: Int): BaseViewHolder = ChannelViewHolder(binding as ItemChannelChattingBinding)
}