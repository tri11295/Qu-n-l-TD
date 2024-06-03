package com.example.qunltd.ui.sum

import android.annotation.SuppressLint
import androidx.recyclerview.widget.RecyclerView
import com.example.qunltd.R
import com.example.qunltd.databinding.ItemFilterBinding
import com.example.qunltd.model.FilterModel

class FilterAdapter {

    inner class FilterViewHolder(private var binding: ItemFilterBinding) :
        RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("UseCompatLoadingForDrawables")
        fun bind(item: FilterModel) {
            with(binding) {
                tvText.text = item.text
                tvText.background =
                    if (item.isSelected) root.context.getDrawable(R.drawable.bg_filter_selected)
                    else root.context.getDrawable(R.drawable.bg_filter)
            }
        }
    }
}