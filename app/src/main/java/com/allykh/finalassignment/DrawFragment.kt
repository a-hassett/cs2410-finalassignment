package com.allykh.finalassignment

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.allykh.finalassignment.databinding.FragmentDrawBinding
import kotlin.math.roundToInt


class DrawFragment : Fragment() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentDrawBinding.inflate(inflater, container, false)
        var shape: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.square_shape, null)
        var color: Int = getResources().getColor(R.color.black)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

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

        //var bitmap = Bitmap.createBitmap(480, 450, Bitmap.Config.ARGB_8888)
        var bitmap: Bitmap = viewModel.currentDrawing.user_image
        var canvas: Canvas = Canvas(bitmap)

        binding.userImageView.setOnTouchListener{ v: View, event ->
            var x = event.x.roundToInt() - 150
            var y = event.y.roundToInt() - 50
            Log.i("coordinates", x.toString() + "," + y.toString())

            shape?.setBounds(x - 10, y - 10, x + 10, y + 10)
            shape?.colorFilter
            shape?.let { DrawableCompat.setTint(it, color) }
            shape?.draw(canvas)
            binding.userImageView.setImageBitmap(bitmap)

            true
        }

        binding.savebutton.setOnClickListener{
            Log.i("TAG", binding.titleText.text.toString())
            viewModel.currentDrawing.title = binding.titleText.text.toString()

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

        return binding.root
    }
}

