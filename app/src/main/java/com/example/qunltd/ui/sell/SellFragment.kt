package com.example.qunltd.ui.sell

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.qunltd.R
import com.example.qunltd.databinding.FragmentSellBinding
import com.example.qunltd.ui.home.Receipt
import com.example.qunltd.ui.home.SellModel

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
            val listRecipt = listOf(
                Receipt("ChiA", 1000),
                Receipt("Chi B", 1235),
                Receipt("Chi C", 1235)
            )
            rvSell.adapter = SellAdapter(
                listOf(
                    SellModel("17/05/2024", listRecipt),
                    SellModel("18/05/2024", listRecipt),
                    SellModel("19/05/2024", listRecipt),
                )
            )
        }
    }
}