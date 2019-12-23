package com.dsm.unlimited.applebox_android.ui.base

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.RecyclerView

abstract class BaseListAdapter<V>(val context : Context?, val lifeCycleOwner : LifecycleOwner) : RecyclerView.Adapter<BaseViewHolder>() {

    abstract val itemList : List<V>

    abstract val layoutId : Int

    override fun getItemCount(): Int = itemList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val binding : ViewDataBinding = DataBindingUtil.inflate(LayoutInflater.from(context), layoutId, parent, false)
        binding.lifecycleOwner = lifeCycleOwner
        return createViewHolder(binding, viewType)
    }

    abstract fun createViewHolder(binding : ViewDataBinding, viewType: Int) : BaseViewHolder

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) = holder.bind(position)
}