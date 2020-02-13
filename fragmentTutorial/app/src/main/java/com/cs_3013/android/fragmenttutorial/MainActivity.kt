package com.cs_3013.android.fragmenttutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.first_fragment.*

class MainActivity : AppCompatActivity() {

    private val fragmentManager = supportFragmentManager
    private val firstFragment = FirstFragment()
    private val secondFragment = SecondFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.myFragment, firstFragment)
        fragmentTransaction.commit()
    }

    fun btnOne(v: View){
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.myFragment, firstFragment)
        fragmentTransaction.commit()
    }

    fun btnTwo(v: View){
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.myFragment, secondFragment)
        fragmentTransaction.commit()
    }

}
