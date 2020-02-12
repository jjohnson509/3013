package com.cs_3013.android.fragmentexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.picture_fragment.*

class PictureFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater?.inflate(R.layout.picture_fragment, container, false)
    }

    fun changePicture(){
        if(camelView.tag.equals("left")){
            camelView.setImageResource(R.drawable.camel_right)
            camelView.tag = "right"
        }
        else{
            camelView.setImageResource(R.drawable.camel_left)
            camelView.tag = "left"
        }
    }
}