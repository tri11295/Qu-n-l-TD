package com.example.qunltd.ui.sell

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.qunltd.databinding.ItemReceiptBinding
import com.example.qunltd.databinding.ItemSellBinding
import com.example.qunltd.ui.home.Receipt
import com.example.qunltd.ui.home.SellModel

class SellAdapter(private val listSellModel: List<SellModel>) :
    RecyclerView.Adapter<SellAdapter.SellViewHolder>() {

    inner class SellViewHolder(private val binding: ItemSellBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: SellModel) {
            with(binding) {
                tvDate.text = item.date
                var sum = 0
                item.listReceipt.forEach {
                    sum += it.sumMoney
                }
                rvSell.adapter = ReceiptAdapter(item.listReceipt)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SellViewHolder {
        val binding = ItemSellBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SellViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SellViewHolder, position: Int) {
        holder.bind(listSellModel[position])
    }

    override fun getItemCount() = listSellModel.count()
}

class ReceiptAdapter(private val list: List<Receipt>) :
    RecyclerView.Adapter<ReceiptAdapter.ReceiptViewHolder>() {

    inner class ReceiptViewHolder(val binding: ItemReceiptBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Receipt) {
            with(binding) {
                tvNameCustomer.text = item.nameCustomer
                tvSum.text = item.sumMoney.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReceiptViewHolder {
        val binding = ItemReceiptBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ReceiptViewHolder(binding)
    }

    override fun getItemCount() = list.count()

    override fun onBindViewHolder(holder: ReceiptViewHolder, position: Int) {
        holder.bind(list[position])
    }
}