package com.dsm.unlimited.applebox_android.customview

import android.content.Context
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.view.LayoutInflater
import android.view.View
import androidx.annotation.LayoutRes
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.dsm.unlimited.applebox_android.ui.base.BaseViewHolder
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlin.math.abs

fun Context.getLayoutInflater(service: String) = this.getSystemService(service) as LayoutInflater

fun ViewPager2.setViewPager(
    adapter: RecyclerView.Adapter<BaseViewHolder>,
    screenPageLimit: Int = 2,
    paddingHorizontal: Int = 200,
    paddingVertical: Int = 0,
    ratio: Float = 0.0F
) =
    this.apply {
        clipChildren = false
        clipToPadding = false
        this.adapter = adapter
        offscreenPageLimit = screenPageLimit
        setPadding(paddingHorizontal, paddingVertical, paddingHorizontal, paddingVertical)
        setPageTransformer { page, position ->
            page scaleX 1 - abs(position) * 0.3f scaleY 1 - abs(position) * 0.3f
        }
    }

fun AppCompatImageView.toCircleImageView() = this.apply {
    background = ShapeDrawable(OvalShape())
    clipToOutline = true
}

infix fun View.scaleX(x: Float) : View {
    this.scaleX = x
    return this
}

infix fun View.scaleY(y: Float) : View{
    this.scaleY = y
    return this
}

fun BottomNavigationView.setBadge(context : Context, @LayoutRes badge : Int) {
    val menuView = (this.getChildAt(0) as BottomNavigationMenuView)
    for(i in 0 until menuView.childCount) {
        val itemView = menuView.getChildAt(i) as BottomNavigationItemView
        LayoutInflater.from(context).inflate(badge, itemView, true)
    }
}

infix fun Int.pxToDp(context : Context) = this / ( context.resources.displayMetrics.density )

infix fun Float.pxToDp(context : Context) = this / ( context.resources.displayMetrics.density )

infix fun Float.dpToPx(context : Context) = this * ( context.resources.displayMetrics.density )

infix fun Int.dpToPx(context : Context) = this * ( context.resources.displayMetrics.density )
