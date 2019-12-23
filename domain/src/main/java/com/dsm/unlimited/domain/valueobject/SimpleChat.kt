package com.dsm.unlimited.domain.valueobject

data class SimpleChat(
    val imageUrl : String? = null,
    val name : String = "전승민",
    val lastChatTime : Int = 6,
    val lastChat : String = "채팅채팅"
) {
}