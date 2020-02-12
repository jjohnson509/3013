package com.cs_3013.android.fragmentexample

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.text_fragment.*
import java.util.*
import kotlin.random.Random


class TextFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.text_fragment, container, false)
    }

    fun changeTextProperties(fontsize: Int, text: String){
        textView1.textSize = fontsize.toFloat()
        textView1.text = text
    }



}
