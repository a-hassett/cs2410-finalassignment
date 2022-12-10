package com.allykh.finalassignment

import android.graphics.Bitmap
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var drawingList = MutableLiveData<ArrayList<ImageFile>>()
    var newlist = arrayListOf<ImageFile>()
    private var bitmap = Bitmap.createBitmap(480, 450, Bitmap.Config.ARGB_8888)
    var currentDrawing: ImageFile = ImageFile("New Drawing", bitmap)

    fun add(){
        val drawing: ImageFile = ImageFile("New Drawing", bitmap)
        newlist.add(drawing)
        drawingList.value = newlist
        currentDrawing = drawing
    }

    fun remove(drawing: ImageFile){
        newlist.remove(drawing)
        drawingList.value = newlist
    }
}
