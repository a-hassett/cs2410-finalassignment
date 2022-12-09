package com.allykh.finalassignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.allykh.finalassignment.databinding.FragmentDrawBinding

class DrawFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentDrawBinding.inflate(inflater, container, false)
        return binding.root


        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_draw, container, false)
    }
}