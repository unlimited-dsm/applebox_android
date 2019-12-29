package com.dsm.unlimited.domain.valueobject

data class ChannelChatting(
    val name : String,
    val profileImageUrl : String,
    val content : String,
    val contentImageUrl : String? = null,
    val time : String
) {
}