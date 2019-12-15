package com.dsm.unlimited.applebox_android.customview

import android.content.Context
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.view.LayoutInflater
import android.view.ViewOutlineProvider
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.view.children
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

fun Context.getLayoutInflater(service : String) = this.getSystemService(service) as LayoutInflater

fun ViewPager2.setViewPager(adapter : RecyclerView.Adapter<RecyclerView.ViewHolder>, screenPageLimit : Int = 2, paddingHorizontal : Int = 200, paddingVertical : Int = 0, ratio : Float) =
    this.apply {
        this.clipChildren = false
        this.clipToPadding = false
        this.adapter = adapter
        offscreenPageLimit = 2
        setPadding(200,0,200,0)
        setPageTransformer { page, position ->
            page.scaleX = 1 - Math.abs(position) * 0.3f
            page.scaleY = 1 - Math.abs(position) * 0.3f
        }
    }

fun AppCompatImageView.toCircleImageView() = this.apply {
    background = ShapeDrawable(OvalShape())
    clipToOutline = true
}