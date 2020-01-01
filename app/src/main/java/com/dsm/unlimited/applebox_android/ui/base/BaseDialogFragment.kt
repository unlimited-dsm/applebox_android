package com.dsm.unlimited.applebox_android.ui.base

import android.app.Dialog
import android.content.DialogInterface
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager

abstract class BaseDialogFragment<T : ViewDataBinding>() : DialogFragment() {

    abstract val layoutId : Int

    val binding by lazy { DataBindingUtil.inflate<T>(requireParentFragment().layoutInflater, layoutId,null,false) }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireContext())
        binding.lifecycleOwner = this
        return builder.setView(binding.root).create().apply {
            window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        }
    }

    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
        (binding.root.parent as? ViewGroup)?.removeView(binding.root)
    }

    fun show(fragmentManager: FragmentManager) = show(fragmentManager, "")
}