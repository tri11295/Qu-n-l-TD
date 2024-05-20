package com.example.qunltd.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.qunltd.R
import com.example.qunltd.databinding.FragmentHomeBinding
import com.example.qunltd.model.HomeModel
import com.example.qunltd.model.HomeTab

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            homeList.root.setOnClickListener {
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToListProductFragment())
            }
            homeSell.root.setOnClickListener {
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToSellFragment())
            }
        }
    }
}