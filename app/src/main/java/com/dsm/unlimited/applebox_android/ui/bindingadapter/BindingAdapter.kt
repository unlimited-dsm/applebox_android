package com.dsm.unlimited.applebox_android.ui.bindingadapter

import android.view.LayoutInflater
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.dsm.unlimited.applebox_android.R
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

@BindingAdapter("badge")
fun bottomNavigationBadge(bottomNavigationView : BottomNavigationView, list : Array<String?>) {
    val menuView = (bottomNavigationView.getChildAt(0) as BottomNavigationMenuView)
    for(i in 0 until menuView.childCount) {
        val itemView = menuView.getChildAt(i) as BottomNavigationItemView
        if(list[i]==null || list[i]=="") continue
        val v = LayoutInflater.from(bottomNavigationView.context).inflate(R.layout.view_badge, itemView, true)
        v.findViewById<TextView>(R.id.badge_tv).text = list[i]
    }
}