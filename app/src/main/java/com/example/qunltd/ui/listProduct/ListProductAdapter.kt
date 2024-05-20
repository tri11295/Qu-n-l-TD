package com.example.qunltd.ui.listProduct

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.qunltd.databinding.ItemListProductBinding
import com.example.qunltd.model.ProductModel

class ListProductAdapter(private val list: List<ProductModel>) :
    RecyclerView.Adapter<ListProductAdapter.ListProductViewHolder>() {

    inner class ListProductViewHolder(private val binding: ItemListProductBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ProductModel) {
            with(binding) {
                tvName.text = item.name
                tvCount.text = "Số lượng : ${item.count} / ${item.unit}"
                tvCashIn.text= "Giá nhập : ${item.priceBuy} / ${item.unit}"
                tvCashOut.text= "Giá nhập : ${item.priceSell} / ${item.unit}"
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListProductViewHolder {
        return ListProductViewHolder(
            ItemListProductBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.count()

    override fun onBindViewHolder(holder: ListProductViewHolder, position: Int) {
        holder.bind(list[position])
    }
}