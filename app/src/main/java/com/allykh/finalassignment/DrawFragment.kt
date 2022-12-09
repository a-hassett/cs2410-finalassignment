package com.allykh.finalassignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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

        //myView.setOnTouchListener(handleTouch);

        return binding.root


        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_draw, container, false)
    }

//    private val handleTouch = OnTouchListener { v, event ->
//        val x = event.x.toInt()
//        val y = event.y.toInt()
//        when (event.action) {
//            MotionEvent.ACTION_DOWN -> Log.i("TAG", "touched down")
//            MotionEvent.ACTION_MOVE -> Log.i("TAG", "moving: ($x, $y)")
//            MotionEvent.ACTION_UP -> Log.i("TAG", "touched up")
//        }
//        true
//    }
}