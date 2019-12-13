package com.dsm.unlimited.applebox_android.customview

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.dsm.unlimited.applebox_android.R

class CustomProfileView(val mContext : Context, val attr : AttributeSet?, val defStyle : Int) : ConstraintLayout(mContext, attr) {
    constructor(mContext : Context, attr : AttributeSet?) : this(mContext,attr,0)
    constructor(mContext : Context) : this(mContext,null)

    init {
        addView(mContext.getLayoutInflater(Context.LAYOUT_INFLATER_SERVICE).inflate(R.layout.view_profile, this,false))
        getAttrs(attr,defStyle)
    }

    private fun getAttrs(attrs : AttributeSet?, defStyle: Int) = setAttrs(mContext.obtainStyledAttributes(attrs, R.styleable.ProfileView, defStyle, 0))

    private fun setAttrs(typedArray : TypedArray) {
        findViewById<TextView>(R.id.custom_view_profile_name_tv).text = typedArray.getString(R.styleable.ProfileView_name)
        findViewById<TextView>(R.id.custom_view_profile_club_name_tv).text = typedArray.getString(R.styleable.ProfileView_subName)
        Glide.with(mContext)
            .load(typedArray.getString(R.styleable.ProfileView_image))
            .placeholder(R.drawable.ic_launcher_background)
            .into(findViewById(R.id.custom_view_profile_image_iv))
        typedArray.recycle()
    }

}