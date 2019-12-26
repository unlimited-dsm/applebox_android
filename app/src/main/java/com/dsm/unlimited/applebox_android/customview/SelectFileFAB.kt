package com.dsm.unlimited.applebox_android.customview

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.constraintlayout.widget.ConstraintLayout
import com.dsm.unlimited.applebox_android.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import org.jetbrains.anko.imageResource

class SelectFileFAB(val mContext : Context, val attrs : AttributeSet?, val defStyle : Int) : ConstraintLayout(mContext, attrs, defStyle) {
    constructor(mContext : Context, attrs : AttributeSet?) : this(mContext, attrs, 0)
    constructor(mContext: Context) : this(mContext, null)

    val SIZE_MINI = 1
    val SIZE_NORMAL = 0
    val SIZE_AUTO = -1

    val typedArray = mContext.obtainStyledAttributes(attrs, R.styleable.SelectFileFAB, defStyle, 0)

    val fabImage1 by lazy { typedArray.getResourceId(R.styleable.SelectFileFAB_fabImage1, R.drawable.folder) }
    val fabImage2 by lazy { typedArray.getResourceId(R.styleable.SelectFileFAB_fabImage2, R.drawable.folder) }
    val fabImage3 by lazy { typedArray.getResourceId(R.styleable.SelectFileFAB_fabImage3, R.drawable.folder) }

    val size : Int by lazy { typedArray.getInt(R.styleable.SelectFileFAB_fabSize, 0) }

    var isFabOpen = false

    val fab1 by lazy { findViewById<FloatingActionButton>(R.id.view_fab1) }
    val fab2 by lazy { findViewById<FloatingActionButton>(R.id.view_fab2) }
    val fab3 by lazy { findViewById<FloatingActionButton>(R.id.view_fab3) }
    val closeButton by lazy { findViewById<AppCompatImageView>(R.id.view_fab_close) }

    init {
        addView(mContext.getLayoutInflater(Context.LAYOUT_INFLATER_SERVICE).inflate(R.layout.view_fab_select_file, this,false))

        fab1.apply {
            size = this@SelectFileFAB.size
            imageResource = fabImage1
            setOnClickListener {
                fabOpen()
            }
        }
        fab2.apply {
            size = this@SelectFileFAB.size
            imageResource = fabImage2
            hide()
        }
        fab3.apply {
            size = this@SelectFileFAB.size
            imageResource = fabImage3
            hide()
        }
        closeButton.apply {
            visibility = View.INVISIBLE
            setOnClickListener {
                fabClose()
            }
        }
    }

    private fun fabOpen() {
        if(isFabOpen) return
        isFabOpen = true
        startAnimate(fab1, -48f, -48f)
        fab2.show()
        startAnimate(fab2, 8f, -56f)
        fab3.show()
        startAnimate(fab3, -56f, 8f)
        closeButton.visibility = View.VISIBLE
    }

    private fun fabClose() {
        if(!isFabOpen) return
        isFabOpen = false
        startAnimate(fab1, 0f, 0f)
        startAnimate(fab2, 0f, 0f)
        fab2.hide()
        startAnimate(fab3, 0f, 0f)
        fab3.hide()
        closeButton.visibility = View.INVISIBLE
    }

    private fun startAnimate(fab : FloatingActionButton, xDp : Float, yDp : Float) {
        fab.animate().translationY(yDp dpToPx mContext).translationX(xDp dpToPx mContext).withLayer()
    }
}