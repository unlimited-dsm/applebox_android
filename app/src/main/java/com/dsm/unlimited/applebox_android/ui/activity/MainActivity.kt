package com.dsm.unlimited.applebox_android.ui.activity

import android.os.Bundle
import androidx.navigation.Navigation
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.ActivityMainBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseActivity
import com.dsm.unlimited.applebox_android.viewmodel.ActivityViewModel
import com.dsm.unlimited.applebox_android.viewmodel.base.BaseViewModel
import javax.inject.Inject

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val layout: Int
        get() = R.layout.activity_main

    @Inject
    override lateinit var viewModel: ActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Navigation.findNavController(this,R.id.main_fragment)
    }
}
