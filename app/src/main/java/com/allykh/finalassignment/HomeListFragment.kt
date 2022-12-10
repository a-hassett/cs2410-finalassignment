package com.allykh.finalassignment

import android.graphics.Bitmap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.allykh.finalassignment.databinding.FragmentHomeListBinding

data class ImageFile(
    var title: String,
    var user_image: Bitmap
)

class HomeListFragment : Fragment() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeListBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        binding.newButton.setOnClickListener{
            viewModel.add()
            findNavController().navigate(R.id.action_homeListFragment_to_drawFragment)
        }

        binding.drawingList.adapter = DrawingAdapter(viewModel, viewModel.newlist)
        binding.drawingList.layoutManager = LinearLayoutManager(activity)

        return binding.root
    }
}