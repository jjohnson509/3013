package com.cs_3013.android.fragmentexample


import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : FragmentActivity(), ToolbarFragment.ToolbarListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onButtonClick(fontsize: Int, text: String) {
        val textFragment = supportFragmentManager.findFragmentById(R.id.text_fragment) as TextFragment
        val picFragment = supportFragmentManager.findFragmentById(R.id.picture_fragment) as PictureFragment
        textFragment.changeTextProperties(fontsize, text)
        picFragment.changePicture()

    }
}
