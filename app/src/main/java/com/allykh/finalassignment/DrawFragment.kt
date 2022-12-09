package com.allykh.finalassignment

//import android.R
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable
import android.graphics.drawable.LayerDrawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
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
        val itemCounter: Int = 1
        var shape: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.square_shape, null)
        var userImage = ResourcesCompat.getDrawable(resources, R.drawable.user_image, null) as LayerDrawable

        binding.squarebutton.setOnClickListener{
            shape = ResourcesCompat.getDrawable(resources, R.drawable.square_shape, null)
        }
        binding.circlebutton.setOnClickListener{
            shape = ResourcesCompat.getDrawable(resources, R.drawable.circle_shape, null)
        }
        binding.trianglebutton.setOnClickListener{
            shape = ResourcesCompat.getDrawable(resources, R.drawable.user_image, null)
        }

        val bitmap = Bitmap.createBitmap(390, 390, Bitmap.Config.ARGB_8888)

        var index: Int
        var item: Drawable?
//        var canvas: Canvas =
        //var bitmap: Bitmap = Bitmap(390, 390)
        var color: Int = ResourcesCompat.getColor(resources, R.color.pink, null)
        binding.userImageView.setOnClickListener{
//            item = ResourcesCompat.getDrawable(resources, R.drawable.circle_shape, null)
//            index = userImage.addLayer(shape)
//            item = userImage.getDrawable(index)

            //userImage.addLayer(shape)
            //bitmap = BitmapFactory.decodeResource(resources, R.drawable.user_image)
            binding.userImageView.setImageBitmap(bitmap)

            //item.setColor
//            DrawableCompat.setTint(item, color)
//            item.draw(Canvas(item))
        }




//        val imageView: ImageView = binding.userImageView
//        val image: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.user_image, null)
//        image.setImageDrawable
//
//

//        var shape: Drawable = context!!.resources.getDrawable(R.drawable.square_shape, context!!.theme)

//        var shape: ShapeDrawable = ShapeDrawable(square_shape)
//        //var shape: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.square_shape, null)
//        var color = ResourcesCompat.getColor(resources, R.color.black, null)
//
//        for(button in binding.shapeGrid){
//            button.setOnClickListener(){
//                shape = button.src
//            }
//        }
//
//        binding.squarebutton.setOnClickListener{
//            shape = ResourcesCompat.getDrawable(resources, R.drawable.square_shape, null)
//        }
//        binding.circlebutton.setOnClickListener{
//            shape = ResourcesCompat.getDrawable(resources, R.drawable.circle_shape, null)
//        }
//        binding.trianglebutton.setOnClickListener{
//            shape = ResourcesCompat.getDrawable(resources, R.drawable.triangle_shape, null)
//        }
//
//        binding.shapeGrid.setOnClickListener{
//
//        }



        //myView.setOnTouchListener(handleTouch);

        binding.savebutton.setOnClickListener{
            Log.i("TAG", binding.titleText.text.toString())
            findNavController().navigate(R.id.action_drawFragment_to_homeListFragment)
        }

        //binding.userImageView.setOnTouchListener

        return binding.root


        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_draw, container, false)
    }

//    override fun onClick(v: View?){
//
//    }


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

//private fun View.setOnClickListener() {
//
//    View.
//}
