package com.example.qunltd.ui.home

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.qunltd.R
import com.example.qunltd.databinding.ItemHomeBinding
import com.example.qunltd.extension.visibleIf
import com.example.qunltd.model.HomeModel

class HomeAdapter(private val list: List<HomeModel>) :
    RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    inner class HomeViewHolder(private val binding: ItemHomeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("StringFormatMatches")
        fun bind(item: HomeModel) {
            with(binding) {
                ivSetting.setImageResource(item.icon)
                tvName.text = item.name
                tvNotification.text = binding.root.context.getString(
                    R.string.text_notification,
                    item.numberNotification
                )
                viewDot.visibleIf(item.numberNotification > 0)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val binding = ItemHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewHolder(binding)
    }

    override fun getItemCount() = list.count()

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bind(list[position])
    }
}