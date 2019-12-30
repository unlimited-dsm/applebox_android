package com.dsm.unlimited.applebox_android.customview

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.dsm.unlimited.applebox_android.R
import com.google.android.material.card.MaterialCardView

class ChannelSpinner(mContext : Context, attr : AttributeSet?, defStyle : Int) : ConstraintLayout(mContext, attr, defStyle) {
    constructor(mContext: Context, attr: AttributeSet?) : this(mContext, attr, 0)
    constructor(mContext: Context) : this(mContext,null)

    var optionSelected = false
    set(value) {
        field = value
        backGround.visibility = if(value) View.VISIBLE else View.INVISIBLE
    }

    val optionButton by lazy { findViewById<AppCompatImageView>(R.id.channel_spinner_option_btn) }

    val backGround by lazy { findViewById<MaterialCardView>(R.id.channel_spinner_option_list) }

    val text1 by lazy { findViewById<AppCompatTextView>(R.id.channel_spinner_text1) }
    val text2 by lazy { findViewById<AppCompatTextView>(R.id.channel_spinner_text2) }
    val text3 by lazy { findViewById<AppCompatTextView>(R.id.channel_spinner_text3) }

    var text1Click : OnClickListener? = null
    set(value) {
        println(value.toString())
        field = value
        text1.setOnClickListener { value }
    }
    var text2Click : OnClickListener? = null
        set(value) {
            field = value
            text2.setOnClickListener { value }
        }
    var text3Click : OnClickListener? = null
        set(value) {
            field = value
            text3.setOnClickListener { value }
        }

    init {
        addView(mContext.getLayoutInflater(Context.LAYOUT_INFLATER_SERVICE).inflate(R.layout.view_channel_spinner, this,false))
        optionButton.setOnClickListener { optionSelected = !optionSelected }
        optionSelected = false
        text1.setOnClickListener { text1Click }
        text2.setOnClickListener { text2Click }
        text3.setOnClickListener { text3Click }
    }


}