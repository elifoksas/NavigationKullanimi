package com.elifoksas.navigationkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.elifoksas.navigationkullanimi.databinding.FragmentSayfaBBinding
import com.elifoksas.navigationkullanimi.databinding.FragmentSayfaXBinding

class SayfaX : Fragment() {


    private lateinit var binding : FragmentSayfaXBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSayfaXBinding.inflate(inflater, container, false)

        binding.buttonY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_sayfaX_to_sayfaY)
        }
        return binding.root
    }


}