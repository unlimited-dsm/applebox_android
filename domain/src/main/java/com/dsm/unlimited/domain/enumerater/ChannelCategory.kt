package com.dsm.unlimited.domain.enumerater

enum class ChannelCategory (val str : String) {
    ASK("ask"),
    PRIVATE("private");

    override fun toString(): String = str
}