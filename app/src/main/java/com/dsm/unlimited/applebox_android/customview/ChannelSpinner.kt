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

    lateinit var text1 : AppCompatTextView
    lateinit var text2 : AppCompatTextView
    lateinit var text3 : AppCompatTextView

    init {
        addView(mContext.getLayoutInflater(Context.LAYOUT_INFLATER_SERVICE).inflate(R.layout.view_channel_spinner, this,false))
        optionButton.setOnClickListener { optionSelected = !optionSelected }
        optionSelected = false

        text1 = findViewById<AppCompatTextView>(R.id.channel_spinner_text1)
        text2 = findViewById<AppCompatTextView>(R.id.channel_spinner_text2)
        text3 = findViewById<AppCompatTextView>(R.id.channel_spinner_text3)
    }


}