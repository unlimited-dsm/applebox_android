package com.dsm.unlimited.applebox_android.ui.base

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.RecyclerView

abstract class BaseBannerListAdapter<BV, V>(val context : Context?, val lifecycleOwner: LifecycleOwner) : RecyclerView.Adapter<BaseViewHolder>() {

    protected val BANNER = 0

    protected val ITEM = 1

    abstract val bannerLayout : Int

    abstract val itemLayout : Int

    abstract val bannerItem : BV

    abstract val itemList : List<V>

    override fun getItemCount(): Int = itemList.size + 1

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) = holder.bind(position - 1)

    override fun getItemViewType(position: Int): Int = if (position==0) BANNER else ITEM

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val binding : ViewDataBinding = DataBindingUtil.inflate(LayoutInflater.from(context), getLayoutId(viewType), parent, false)
        binding.lifecycleOwner = lifecycleOwner
        return createViewHolder(binding)
    }

    fun getLayoutId(viewType : Int) = if(viewType==BANNER) bannerLayout else itemLayout

    abstract fun createViewHolder(binding: ViewDataBinding) : BaseViewHolder
}
