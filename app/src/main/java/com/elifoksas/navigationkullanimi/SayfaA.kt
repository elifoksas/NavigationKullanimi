package com.elifoksas.navigationkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.elifoksas.navigationkullanimi.databinding.FragmentAnasayfaBinding
import com.elifoksas.navigationkullanimi.databinding.FragmentSayfaABinding


class SayfaA : Fragment() {

    private lateinit var binding : FragmentSayfaABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSayfaABinding.inflate(inflater, container, false)

        binding.buttonB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_sayfaA_to_sayfaB)
        }


        return binding.root
    }


}