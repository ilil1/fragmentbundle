package com.project.fragmentbundle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.fragmentbundle.databinding.FragmentSenderBinding

class SenderFragment : Fragment() {

    private lateinit var binding: FragmentSenderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentSenderBinding.inflate(layoutInflater)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.btnYes.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("key", "yes")
            val recieverFragment = RecieverFragment()
            recieverFragment.arguments = bundle
            parentFragmentManager.beginTransaction().
            replace(R.id.receiver, recieverFragment).commit()
        }
        binding.btnNo.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("key", "no")
            val recieverFragment = RecieverFragment()
            recieverFragment.arguments = bundle
            parentFragmentManager.beginTransaction().
            replace(R.id.receiver, recieverFragment).commit()
        }
    }
}