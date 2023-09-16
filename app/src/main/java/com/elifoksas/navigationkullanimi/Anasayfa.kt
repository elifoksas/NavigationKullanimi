package com.elifoksas.navigationkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.elifoksas.navigationkullanimi.databinding.FragmentAnasayfaBinding

class Anasayfa : Fragment() {

    private lateinit var binding : FragmentAnasayfaBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonA.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_anasayfa_to_sayfaA)
        }
        binding.buttonX.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_anasayfa_to_sayfaX)
        }

        return binding.root
    }

}