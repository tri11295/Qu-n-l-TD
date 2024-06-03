package com.example.qunltd.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.text.HtmlCompat
import androidx.navigation.fragment.findNavController
import com.example.qunltd.databinding.FragmentHomeBinding

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
            val htmlText = "<ol><li>Mục 1</li><li>Mục 2</li></ol>"
            tvText1.text = HtmlCompat.fromHtml(htmlText, HtmlCompat.FROM_HTML_MODE_LEGACY)

            homeList.root.setOnClickListener {
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToListProductFragment())
            }
            homeSell.root.setOnClickListener {
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToSellFragment())
            }
            homeSum.root.setOnClickListener {
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToSumFragment())
            }
        }
    }
}