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
                tvPriceBuy.text = item.priceBuy
                tvPriceSell.text = item.priceSell
                tvCount.text = item.count.toString()
                tvUnit.text = item.unit
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