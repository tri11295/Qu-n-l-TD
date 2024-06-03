package com.example.qunltd.ui.sum

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.qunltd.common.DateTimeCommon
import com.example.qunltd.databinding.BottomSheetFilterTimeBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetFilterTime : BottomSheetDialogFragment() {

    private lateinit var binding: BottomSheetFilterTimeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = BottomSheetFilterTimeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return super.onCreateDialog(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            tvDateStart.text = DateTimeCommon.getCurrentDate()
            tvDateEnd.text = DateTimeCommon.getCurrentDate()

            btnCancel.setOnClickListener {
                dismiss()
            }
            btnConfirm.setOnClickListener {
                dismiss()
            }
            tvDateStart.setOnClickListener {
            }
            tvDateEnd.setOnClickListener {
            }
        }
    }
}