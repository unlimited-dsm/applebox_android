package com.dsm.unlimited.applebox_android.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.FragmentMainPoliticsBinding
import com.dsm.unlimited.applebox_android.ui.adapter.MainPoliticsAdapter
import com.dsm.unlimited.applebox_android.ui.base.BaseFragment
import com.dsm.unlimited.applebox_android.viewmodel.MainPoliticsViewModel
import javax.inject.Inject

class MainPoliticsFragment() : BaseFragment<FragmentMainPoliticsBinding>() {
    override val layout: Int
        get() = R.layout.fragment_main_politics

    @Inject
    override lateinit var viewModel: MainPoliticsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.mainPoliticsPosterRecyclerview.apply{
            adapter = MainPoliticsAdapter(this@MainPoliticsFragment)
            layoutManager = LinearLayoutManager(this.context)
        }
    }
}