package com.elifoksas.navigationkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import com.elifoksas.navigationkullanimi.databinding.FragmentSayfaBBinding
import com.elifoksas.navigationkullanimi.databinding.FragmentSayfaYBinding


class SayfaY : Fragment() {

    private lateinit var binding : FragmentSayfaYBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSayfaYBinding.inflate(inflater, container, false)

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner){
            findNavController().popBackStack(R.id.anasayfa,false)
        }

        return binding.root
    }


}