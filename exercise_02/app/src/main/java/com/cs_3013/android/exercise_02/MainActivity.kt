package com.cs_3013.android.exercise_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_settings)

        //1
        if (savedInstanceState == null){
            //2
            supportFragmentManager
                //3
                .beginTransaction()
                //4
                .add(R.id.container, )

        }

    }


}
