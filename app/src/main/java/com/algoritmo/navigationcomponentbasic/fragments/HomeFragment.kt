package com.algoritmo.navigationcomponentbasic.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.algoritmo.navigationcomponentbasic.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.btOpenDetails.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToDetalleFragment2())
        }
        binding.btOpenProfile.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToPerfilFragment())
        }
        return binding.root
    }
}