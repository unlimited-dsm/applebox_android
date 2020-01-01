package com.dsm.unlimited.applebox_android.ui.bindingadapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.customview.ChannelSpinner
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

@BindingAdapter("badge")
fun bottomNavigationBadge(bottomNavigationView: BottomNavigationView, list: Array<String?>) {
    val menuView = (bottomNavigationView.getChildAt(0) as BottomNavigationMenuView)
    for (i in 0 until menuView.childCount) {
        val itemView = menuView.getChildAt(i) as BottomNavigationItemView
        if (list[i] == null || list[i] == "") continue
        val v = LayoutInflater.from(bottomNavigationView.context)
            .inflate(R.layout.view_badge, itemView, true)
        v.findViewById<TextView>(R.id.badge_tv).text = list[i]
    }
}

@BindingAdapter("onText1Click")
fun text1Click(view: ChannelSpinner, listener: View.OnClickListener) {
    view.text1.setOnClickListener { listener.onClick(it) }
}

@BindingAdapter("onText2Click")
fun text2Click(view: ChannelSpinner, listener: View.OnClickListener) {
    view.text2.setOnClickListener { listener.onClick(it) }
}

@BindingAdapter("onText3Click")
fun text3Click(view: ChannelSpinner, listener: View.OnClickListener) {
    view.text3.setOnClickListener { listener.onClick(it) }
}