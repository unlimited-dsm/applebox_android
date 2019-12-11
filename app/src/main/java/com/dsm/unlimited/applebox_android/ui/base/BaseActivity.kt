package com.dsm.unlimited.applebox_android.ui.base

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Observer
import com.dsm.unlimited.applebox_android.lifecycle.LifeCycleManager
import com.dsm.unlimited.applebox_android.viewmodel.base.BaseViewModel
import dagger.android.support.DaggerAppCompatActivity
import org.jetbrains.anko.toast

abstract class BaseActivity<T : ViewDataBinding>() : DaggerAppCompatActivity() {
    
    val lifeCycleManager = LifeCycleManager()
    abstract val viewModel : BaseViewModel
    abstract val layout : Int
    lateinit var binding : T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layout)
        binding.lifecycleOwner = this
        add(viewModel)
        viewModel.toast.observe(this, Observer { toast(it) })
        notify(Lifecycle.Event.ON_CREATE)
    }

    override fun onStart() {
        notify(Lifecycle.Event.ON_START)
        super.onStart()
    }

    override fun onResume() {
        notify(Lifecycle.Event.ON_RESUME)
        super.onResume()
    }

    override fun onStop() {
        notify(Lifecycle.Event.ON_STOP)
        super.onStop()
    }

    override fun onDestroy() {
        notify(Lifecycle.Event.ON_DESTROY)
        remove(viewModel)
        super.onDestroy()
    }

    fun add(viewModel : BaseViewModel) = lifeCycleManager.add(viewModel)

    fun remove(viewModel: BaseViewModel) = lifeCycleManager.remove(viewModel)

    fun notify(event : Lifecycle.Event) = lifeCycleManager.notify(event)
}