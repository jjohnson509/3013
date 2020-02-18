package com.cs_3013.android.colorfinder


import android.graphics.Color
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBar_red.setOnSeekBarChangeListener(this)
        seekBar_green.setOnSeekBarChangeListener(this)
        seekBar_blue.setOnSeekBarChangeListener(this)
    }


    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        when(seekBar){
            seekBar_red -> colorR.text = "$progress"
            seekBar_green -> colorG.text = "$progress"
            seekBar_blue -> colorB.text = "$progress"
        }

        var newColor : Int = Color.rgb(colorR.text.toString().toInt(), colorG.text.toString().toInt(), colorB.text.toString().toInt())
        colorSwatch.setBackgroundColor(newColor)


    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {

    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {

    }
}



