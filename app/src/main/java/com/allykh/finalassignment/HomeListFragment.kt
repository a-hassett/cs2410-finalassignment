package com.allykh.finalassignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.allykh.finalassignment.databinding.FragmentHomeListBinding

class HomeListFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeListBinding.inflate(inflater, container, false)

        binding.button.setOnClickListener{
            findNavController().navigate(R.id.action_homeListFragment_to_drawFragment)
        }

        return binding.root

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home_list, container, false)
    }
}