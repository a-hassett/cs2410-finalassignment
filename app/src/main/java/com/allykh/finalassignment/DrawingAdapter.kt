package com.allykh.finalassignment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.allykh.finalassignment.databinding.DrawingListItemBinding

class DrawingAdapter (val viewModel: MainViewModel, val drawings: ArrayList<ImageFile>, val onClick: (ImageFile) -> Unit = {}): RecyclerView.Adapter<DrawingAdapter.ViewHolder>(){
    inner class ViewHolder(val binding: DrawingListItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(drawing: ImageFile) {
            binding.drawingTitle.text = drawing.title
            binding.drawingImage.setImageBitmap(drawing.user_image)
            binding.editButton.setOnClickListener{
                viewModel.currentDrawing = drawing
                it.findNavController().navigate(R.id.action_homeListFragment_self)
            }
            binding.deleteButton.setOnClickListener{
                viewModel.remove(drawing)
                notifyItemRemoved(drawings.indexOf(drawing))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val binding = DrawingListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        holder.bind(drawings[position])
    }

    override fun getItemCount(): Int {
        return drawings.size
    }
}