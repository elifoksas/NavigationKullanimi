package com.elifoksas.navigationkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.elifoksas.navigationkullanimi.databinding.FragmentSayfaABinding
import com.elifoksas.navigationkullanimi.databinding.FragmentSayfaBBinding

class SayfaB : Fragment() {

    private lateinit var binding : FragmentSayfaBBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSayfaBBinding.inflate(inflater, container, false)

        binding.buttonY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_sayfaB_to_sayfaY)
        }

        return binding.root
    }


}