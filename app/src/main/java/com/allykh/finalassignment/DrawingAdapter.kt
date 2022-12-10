package com.allykh.finalassignment

import android.content.ClipData.Item
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.allykh.finalassignment.databinding.DrawingListItemBinding

class DrawingAdapter (val drawings: MutableList<ImageFile>, val onClick: (ImageFile) -> Unit = {}): RecyclerView.Adapter<DrawingAdapter.ViewHolder>(){
    class ViewHolder(val binding: DrawingListItemBinding): RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val binding = DrawingListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val drawing = drawings[position]
        holder.binding.drawingTitle.text = drawing.title
        holder.binding.drawingImage.setImageBitmap(drawing.user_image)

        holder.binding.editButton.setOnClickListener{

        }
        holder.binding.deleteButton.setOnClickListener{
            removeItem(position)
        }
    }

    fun removeItem(position: Int) {
        drawings.removeAt(position)
        notifyItemRemoved(position)
        notifyItemRangeChanged(position, drawings.size)
    }

    override fun getItemCount(): Int {
        return drawings.size
    }
}