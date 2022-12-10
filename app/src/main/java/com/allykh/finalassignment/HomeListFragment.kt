package com.allykh.finalassignment

import android.graphics.Bitmap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.allykh.finalassignment.databinding.FragmentHomeListBinding

data class ImageFile(
    var title: String,
    var user_image: Bitmap
)

class HomeListFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeListBinding.inflate(inflater, container, false)

        var bitmap = Bitmap.createBitmap(480, 450, Bitmap.Config.ARGB_8888)
        var drawingList: MutableList<ImageFile> = mutableListOf(ImageFile("First", bitmap))

        binding.newButton.setOnClickListener{
            drawingList.add(ImageFile("New Drawing", bitmap))
            findNavController().navigate(R.id.action_homeListFragment_to_drawFragment)
        }

        binding.drawingList.adapter = DrawingAdapter(drawingList)
        binding.drawingList.layoutManager = LinearLayoutManager(activity)

        return binding.root
    }
}