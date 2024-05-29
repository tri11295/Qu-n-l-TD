package com.example.qunltd.ui.sell

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.qunltd.databinding.ItemReceiptBinding
import com.example.qunltd.databinding.ItemReceiptProductBinding
import com.example.qunltd.databinding.ItemSellBinding
import com.example.qunltd.extension.gone
import com.example.qunltd.extension.visible
import com.example.qunltd.model.ProductModel
import com.example.qunltd.model.Receipt
import com.example.qunltd.model.SellModel

class SellAdapter(private val listSellModel: List<SellModel>) :
    RecyclerView.Adapter<SellAdapter.SellViewHolder>() {

    inner class SellViewHolder(private val binding: ItemSellBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: SellModel) {
            with(binding) {
                tvDate.text = item.date
                tvCount.text = item.listReceipt.size.toString()
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
                tvNameCustomer.text = item.customer.name
                var sum = 0
                item.listProduct.forEach {
                    sum += it.priceSell.times(it.count)
                }
                tvSum.text = sum.toString()
                tvShow.setOnClickListener {
                    if (rvProduct.isVisible){
                        tvShow.text = "Hiển thị"
                        rvProduct.gone()
                    } else {
                        tvShow.text = "Ẩn"
                        rvProduct.visible()
                    }
                }
                rvProduct.adapter = ReceiptProductAdapter(item.listProduct)
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

class ReceiptProductAdapter(private val listProduct: List<ProductModel>) :
    RecyclerView.Adapter<ReceiptProductAdapter.ReceiptProductViewHolder>() {

    inner class ReceiptProductViewHolder(val binding: ItemReceiptProductBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ProductModel) {
            binding.tvNameProduct.text = "${item.name} - ${item.count}"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReceiptProductViewHolder {
        val binding =
            ItemReceiptProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ReceiptProductViewHolder(binding)
    }

    override fun getItemCount() = listProduct.size

    override fun onBindViewHolder(holder: ReceiptProductViewHolder, position: Int) {
        holder.bind(listProduct[position])
    }
}