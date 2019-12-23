package com.dsm.unlimited.domain.valueobject

import com.dsm.unlimited.domain.enumerater.ChannelCategory

data class Channel(
    val name : String,
    val lastChat : String,
    val lastTime : String,
    val category: ChannelCategory
) {
}
