package com.dsm.unlimited.applebox_android.ui.base

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder(binding : ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {

    abstract fun bind(position : Int)
}