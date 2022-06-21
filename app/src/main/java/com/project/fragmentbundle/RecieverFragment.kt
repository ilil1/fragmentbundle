package com.project.fragmentbundle

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.fragmentbundle.databinding.FragmentRecieverBinding


// TODO: Rename parameter arguments, choose names that match

class RecieverFragment : Fragment() {

    private lateinit var binding: FragmentRecieverBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentRecieverBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        arguments?.getString("key")?.let {
            binding.textView.text = it
        }

        return binding.root
    }
}