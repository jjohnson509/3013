package com.cs_3013.android.fragmentexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.picture_fragment.*

class PictureFragment : Fragment() {
    var count = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater?.inflate(R.layout.picture_fragment, container, false)
    }

    fun changePicture(){
        var picArray = arrayOf(R.drawable.wm_001, R.drawable.wm_002, R.drawable.wm_003, R.drawable.wm_004, R.drawable.wm_005, R.drawable.wm_006, R.drawable.wm_007, R.drawable.wm_008)

        if ( count > 7){
            count = 0
        }
        camelView.setImageResource(picArray[count])
        count += 1
//
//        if(camelView.tag.equals("left")){
//            camelView.setImageResource(R.drawable.camel_right)
//            camelView.tag = "right"
//        }
//        else{
//            camelView.setImageResource(R.drawable.camel_left)
//            camelView.tag = "left"
//        }
    }
}