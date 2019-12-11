package com.dsm.unlimited.applebox_android.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Observer
import com.dsm.unlimited.applebox_android.lifecycle.LifeCycleManager
import com.dsm.unlimited.applebox_android.viewmodel.base.BaseViewModel
import dagger.android.support.DaggerFragment
import org.jetbrains.anko.support.v4.toast

abstract class BaseFragment<T : ViewDataBinding>() : DaggerFragment() {
    abstract val layout: Int
    abstract val viewModel: BaseViewModel
    lateinit var binding: T
    val lifeCycleManager = LifeCycleManager()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layout, container, false)
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        add(viewModel)
        notify(Lifecycle.Event.ON_CREATE)
        viewModel.toast.observe(this, Observer { toast(it) })
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        notify(Lifecycle.Event.ON_START)
        super.onStart()
    }

    override fun onResume() {
        notify(Lifecycle.Event.ON_RESUME)
        super.onResume()
    }

    override fun onPause() {
        notify(Lifecycle.Event.ON_PAUSE)
        super.onPause()
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

    fun add(viewModel: BaseViewModel) = lifeCycleManager.add(viewModel)

    fun remove(viewModel: BaseViewModel) = lifeCycleManager.remove(viewModel)

    fun notify(event: Lifecycle.Event) = lifeCycleManager.notify(event)
}