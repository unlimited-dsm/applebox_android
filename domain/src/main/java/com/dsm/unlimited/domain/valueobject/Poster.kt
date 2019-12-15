package com.dsm.unlimited.domain.valueobject

import java.util.*

data class Poster(
    val profileImage : String,
    val writer : String,
    val postTime : Date,
    val content : String,
    val contentImage : String,
    val likeCount : Int,
    val commentCount : Int
    ) {
}