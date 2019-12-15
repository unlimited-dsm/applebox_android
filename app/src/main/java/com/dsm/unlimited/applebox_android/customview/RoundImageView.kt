package com.dsm.unlimited.applebox_android.customview

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import com.dsm.unlimited.applebox_android.R
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.imageResource

class RoundImageView(val mContext : Context, val attr : AttributeSet?, val defStyle : Int) : AppCompatImageView(mContext, attr, defStyle) {
    constructor(mContext: Context, attr: AttributeSet?) : this(mContext, attr, 0)
    constructor(mContext: Context) : this(mContext,null,0)

    private val typedArray = mContext.obtainStyledAttributes(attr, R.styleable.RoundImageView, defStyle, 0)

    val imageUrl by lazy { typedArray.getString(R.styleable.RoundImageView_backGroundImage) ?: "" }

    init {
        setAttrs()
    }

    fun setAttrs() {
        clipToOutline = true

        if(isInEditMode) {
            this.imageResource = R.drawable.ic_launcher_background
        } else {
            Glide.with(mContext)
                .load(imageUrl)
                .into(this)
        }
    }
}