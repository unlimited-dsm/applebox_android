package com.dsm.unlimited.domain.valueobject

data class Politics(
    val imageUrl : String,
    val name : String,
    val content : String,
    val positive : String,
    val negative : String,
    val commentCount : Int
)