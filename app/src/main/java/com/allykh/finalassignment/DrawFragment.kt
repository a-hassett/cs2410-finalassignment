package com.allykh.finalassignment

//import android.R

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.graphics.drawable.LayerDrawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnTouchListener
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.allykh.finalassignment.databinding.FragmentDrawBinding
import kotlin.math.roundToInt


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
        var color: Int = getResources().getColor(R.color.black)

        binding.squarebutton.setOnClickListener{
            shape = ResourcesCompat.getDrawable(resources, R.drawable.square_shape, null)
        }
        binding.circlebutton.setOnClickListener{
            shape = ResourcesCompat.getDrawable(resources, R.drawable.circle_shape, null)
        }
        binding.trianglebutton.setOnClickListener{
            shape = ResourcesCompat.getDrawable(resources, R.drawable.triangle_shape, null)
        }

        binding.redbutton.setOnClickListener{
            color = getResources().getColor(R.color.red)
        }
        binding.orangeredbutton.setOnClickListener{
            color = getResources().getColor(R.color.orange_red)
        }
        binding.tangerinebutton.setOnClickListener{
            color = getResources().getColor(R.color.tangerine)
        }
        binding.goldenrodbutton.setOnClickListener{
            color = getResources().getColor(R.color.goldenrod)
        }
        binding.cornbutton.setOnClickListener{
            color = getResources().getColor(R.color.corn)
        }
        binding.limebutton.setOnClickListener{
            color = getResources().getColor(R.color.lime)
        }
        binding.greenbutton.setOnClickListener{
            color = getResources().getColor(R.color.green)
        }
        binding.armybutton.setOnClickListener{
            color = getResources().getColor(R.color.army)
        }
        binding.navybutton.setOnClickListener{
            color = getResources().getColor(R.color.navy)
        }
        binding.bluebutton.setOnClickListener{
            color = getResources().getColor(R.color.blue)
        }
        binding.oceanbutton.setOnClickListener{
            color = getResources().getColor(R.color.ocean)
        }
        binding.skybutton.setOnClickListener{
            color = getResources().getColor(R.color.sky)
        }
        binding.lavenderbutton.setOnClickListener{
            color = getResources().getColor(R.color.lavender)
        }
        binding.violetbutton.setOnClickListener{
            color = getResources().getColor(R.color.violet)
        }
        binding.berrybutton.setOnClickListener{
            color = getResources().getColor(R.color.berry)
        }
        binding.pinkbutton.setOnClickListener{
            color = getResources().getColor(R.color.pink)
        }
        binding.rosebutton.setOnClickListener{
            color = getResources().getColor(R.color.rose)
        }
        binding.whitebutton.setOnClickListener{
            color = getResources().getColor(R.color.white)
        }
        binding.silverbutton.setOnClickListener{
            color = getResources().getColor(R.color.silver)
        }
        binding.charcoalbutton.setOnClickListener{
            color = getResources().getColor(R.color.charcoal)
        }
        binding.blackbutton.setOnClickListener{
            color = getResources().getColor(R.color.black)
        }
        binding.chocolatebutton.setOnClickListener{
            color = getResources().getColor(R.color.chocolate)
        }
        binding.brownbutton.setOnClickListener{
            color = getResources().getColor(R.color.brown)
        }
        binding.beigebutton.setOnClickListener{
            color = getResources().getColor(R.color.beige)
        }



        var bitmap = Bitmap.createBitmap(480, 450, Bitmap.Config.ARGB_8888)
        var canvas: Canvas = Canvas(bitmap)

        binding.userImageView.setOnTouchListener{ v: View, event ->
            //Log.i("imageviewandontouchlistener", "imageView1 onTouch")
            //false

            var x = event.x.roundToInt() - 150
            var y = event.y.roundToInt() - 50
            Log.i("coordinates", x.toString() + "," + y.toString())

            shape?.setBounds(x - 10, y - 10, x + 10, y + 10)
            shape?.colorFilter
            shape?.let { DrawableCompat.setTint(it, color) }
            shape?.draw(canvas)
            binding.userImageView.setImageBitmap(bitmap)

//            val canvasToBitmap: CanvasToBitmap
//
//            CanvasToBitmap canvasToBitmap = new CanvasToBitmap(getBaseContext());
//
//            Bitmap bitmap = canvasToBitmap.bitmap;

            true
        }




        var index: Int
        var item: Drawable?
//        var canvas: Canvas =
        //var bitmap: Bitmap = Bitmap(390, 390)
        //var color: Int = ResourcesCompat.getColor(resources, R.color.pink, null)
        binding.userImageView.setOnClickListener{
            //bitmap.setPixel
//            item = ResourcesCompat.getDrawable(resources, R.drawable.circle_shape, null)
//            index = userImage.addLayer(shape)
//            item = userImage.getDrawable(index)

            //userImage.addLayer(shape)
            //bitmap = BitmapFactory.decodeResource(resources, R.drawable.user_image)
            //binding.userImageView.setImageBitmap(bitmap)

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

            // reset shape buttons at bottom of screen to be black
            color = getResources().getColor(R.color.black)
            shape = ResourcesCompat.getDrawable(resources, R.drawable.square_shape, null)
            shape?.let { DrawableCompat.setTint(it, color) }
            shape = ResourcesCompat.getDrawable(resources, R.drawable.circle_shape, null)
            shape?.let { DrawableCompat.setTint(it, color) }
            shape = ResourcesCompat.getDrawable(resources, R.drawable.triangle_shape, null)
            shape?.let { DrawableCompat.setTint(it, color) }

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
