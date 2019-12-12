package com.dsm.unlimited.applebox_android.ui.activity

import android.os.Bundle
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.ActivityMainBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val layout: Int
        get() = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
