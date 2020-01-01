package com.dsm.unlimited.applebox_android.ui.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dsm.unlimited.applebox_android.R
import com.dsm.unlimited.applebox_android.databinding.DialogClubChannelDeleteBinding
import com.dsm.unlimited.applebox_android.ui.base.BaseDialogFragment
import com.dsm.unlimited.applebox_android.viewmodel.MainClubViewModel

class DeleteChannelDialog(val viewModel : MainClubViewModel) : BaseDialogFragment<DialogClubChannelDeleteBinding>() {

    override val layoutId: Int
        get() = R.layout.dialog_club_channel_delete

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.vm = viewModel
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}