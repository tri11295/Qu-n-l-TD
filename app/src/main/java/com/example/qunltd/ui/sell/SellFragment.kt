package com.example.qunltd.ui.sell

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.qunltd.databinding.FragmentSellBinding
import com.example.qunltd.model.Customer
import com.example.qunltd.model.ProductModel
import com.example.qunltd.model.Receipt
import com.example.qunltd.model.SellModel

class SellFragment : Fragment() {

    private lateinit var binding: FragmentSellBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSellBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            val listProduct = listOf(
                ProductModel("Vở thuận tiến 1", 10000, 110000, 4, "Thùng"),
                ProductModel("Vở thuận tiến 2", 10000, 110000, 2, "Thùng"),
                ProductModel("Vở thuận tiến 3", 10000, 110000, 10, "Thùng"),
                ProductModel("Vở thuận tiến 4", 10000, 110000, 5, "Thùng"),
            )
            val listReceipt = listOf(
                Receipt(Customer("Chi A"), listProduct),
                Receipt(Customer("Chi B"), listProduct),
                Receipt(Customer("Anh C"), listProduct)
            )
            rvSell.adapter = SellAdapter(
                listOf(
                    SellModel("17/05/2024", listReceipt),
                    SellModel("18/05/2024", listReceipt),
                    SellModel("19/05/2024", listReceipt),
                )
            )
        }
    }
}