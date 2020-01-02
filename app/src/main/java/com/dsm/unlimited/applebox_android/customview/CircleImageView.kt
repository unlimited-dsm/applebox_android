package com.dsm.unlimited.applebox_android.customview

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView

class CircleImageView(mContext : Context, val attr : AttributeSet?, defStyle : Int) : AppCompatImageView(mContext, attr, defStyle){
    constructor(mContext: Context, attr: AttributeSet?) : this(mContext, attr, 0)
    constructor(mContext: Context) : this(mContext, null, 0)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        this.toCircleImageView()
    }
}