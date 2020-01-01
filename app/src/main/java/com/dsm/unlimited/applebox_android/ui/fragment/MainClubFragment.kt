package com.dsm.unlimited.applebox_android.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.FragmentMainClubBinding
import com.dsm.unlimited.applebox_android.ui.adapter.MainClubAdapter
import com.dsm.unlimited.applebox_android.ui.base.BaseFragment
import com.dsm.unlimited.applebox_android.ui.dialog.DeleteChannelDialog
import com.dsm.unlimited.applebox_android.util.ChannelNavigator
import com.dsm.unlimited.applebox_android.viewmodel.MainClubViewModel
import javax.inject.Inject

class MainClubFragment() : BaseFragment<FragmentMainClubBinding>(), ChannelNavigator {
    override val layout: Int
        get() = R.layout.fragment_main_club

    @Inject
    override lateinit var viewModel: MainClubViewModel
    @Inject
    lateinit var mainFragment: MainFragment
    @Inject
    lateinit var deleteChannelDialog: DeleteChannelDialog

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.vm = viewModel
        binding.mainClubChannelRecyclerview.apply {
            adapter = MainClubAdapter(this@MainClubFragment)
            layoutManager = LinearLayoutManager(this.context)
        }
    }

    override fun navigateChannel() = NavHostFragment.findNavController(mainFragment).navigate(R.id.action_mainFragment_to_channelFragment)

    override fun navigateDeleteChannel() = deleteChannelDialog.show(fragmentManager!!)

    override fun deleteChannelDialogApply() {
        deleteChannelDialog.dismiss()
    }

    override fun deleteChannelDialogCancel() {
        deleteChannelDialog.dismiss()
    }
}