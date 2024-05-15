package com.example.qunltd.ui.listProduct

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.qunltd.databinding.FragmentListProductBinding
import com.example.qunltd.model.ProductModel

class ListProductFragment : Fragment() {

    private lateinit var binding: FragmentListProductBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListProductBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            rvProduct.adapter = ListProductAdapter(
                listOf(
                    ProductModel("Vở thuận tiến", "100.000", "110.000", 100, "Thùng"),
                    ProductModel("Vở thuận tiến", "100.000", "110.000", 100, "Thùng"),
                    ProductModel("Vở thuận tiến", "100.000", "110.000", 100, "Thùng"),
                    ProductModel("Vở thuận tiến", "100.000", "110.000", 100, "Thùng"),
                    ProductModel("Vở thuận tiến", "100.000", "110.000", 100, "Thùng"),
                )
            )
        }
    }
}