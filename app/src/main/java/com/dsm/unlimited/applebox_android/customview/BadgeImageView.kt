package com.dsm.unlimited.applebox_android.customview

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.dsm.unlimited.applebox_android.R
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColor

class BadgeImageView(val mContext : Context, val attr : AttributeSet?, val defStyle : Int) : ConstraintLayout(mContext,attr,defStyle) {
    constructor(mContext : Context, attr: AttributeSet?) : this(mContext, attr, 0)
    constructor(mContext: Context) : this(mContext, null, 0)

    private val typedArray = mContext.obtainStyledAttributes(attr, R.styleable.BadgeImageView, defStyle, 0)

    val icon by lazy { typedArray.getResourceId(R.styleable.BadgeImageView_icon,R.drawable.ic_notifications_black_24dp) }
    val iconColor by lazy { typedArray.getResourceId(R.styleable.BadgeImageView_iconColor, R.color.gray) }
    var badgeText = 0
    set(value) {
        field = value
        invalidate()
    }
    val badgeVisibility : Boolean
        get() = badgeText!=0
    val badgeColor by lazy { typedArray.getResourceId(R.styleable.BadgeImageView_badgeColor, R.color.colorPrimary) }
    val badgeTextColor by lazy { typedArray.getResourceId(R.styleable.BadgeImageView_badgeTextColor, R.color.white) }

    val iconImage by lazy { findViewById<ImageView>(R.id.custom_view_badge_image_view_image) }
    val badgeTextView by lazy { findViewById<TextView>(R.id.custom_view_badge_image_view_text) }

    init {
        addView(mContext.getLayoutInflater(Context.LAYOUT_INFLATER_SERVICE).inflate(R.layout.view_badge_image_view, this,false))
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        Log.e(this.javaClass.simpleName,badgeText.toString())
        setAttrs()
    }

    private fun setAttrs() {
        iconImage.apply {
            this.backgroundResource = icon
            this.backgroundTintList = ContextCompat.getColorStateList(mContext, iconColor)
        }
        badgeTextView.apply {
            this.text = badgeText.toString()
            this.visibility = if(badgeVisibility) View.VISIBLE else View.INVISIBLE
            this.backgroundTintList = ContextCompat.getColorStateList(mContext, badgeColor)
            this.textColor = ContextCompat.getColor(mContext,badgeTextColor)
        }
    }
}