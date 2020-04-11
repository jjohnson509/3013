package com.cs_3013.android.flashbeepshake

import android.content.Context
import android.hardware.camera2.CameraManager
import android.media.AudioManager
import android.media.ToneGenerator
import android.os.Build
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val flashBtn = findViewById<Button>(R.id.flash_btn)
        val beepBtn = findViewById<Button>(R.id.beep_btn)
        val shakeBtn = findViewById<Button>(R.id.shake_btn)
        val camManager = getSystemService(Context.CAMERA_SERVICE) as CameraManager
        val cameraId = camManager.cameraIdList[0] // Usually front camera is at 0 position.
        var flashOn = false
        val tone = ToneGenerator(AudioManager.STREAM_MUSIC, 100)



        flashBtn.setOnClickListener{
            if(!flashOn) {
                flashOn = true
                camManager.setTorchMode(cameraId, true)
            }
            else {
                flashOn = false
                camManager.setTorchMode(cameraId, false)

            }
        }

        beepBtn.setOnClickListener{
            tone.startTone(ToneGenerator.TONE_CDMA_ABBR_INTERCEPT, 600)

        }

        shakeBtn.setOnClickListener{
            val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createOneShot(200, VibrationEffect.DEFAULT_AMPLITUDE))
            } else {
                vibrator.vibrate(200)
            }
        }





    }

//










//    fun flash() {
//        val camManager = getSystemService(Context.CAMERA_SERVICE) as CameraManager
//        val cameraId = camManager.cameraIdList[0] // Usually front camera is at 0 position.
//        flashBtn.setOnClickListener{
//            camManager.setTorchMode(cameraId, true)
//        }


//    }
}
