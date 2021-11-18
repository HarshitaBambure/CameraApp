package com.example.cameraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_camera.setOnClickListener {
            startActivity(Intent(this, CameraActivity::class.java))
        }

        btn_img.setOnClickListener {
            startActivity(Intent(this, ImageViewerActivity::class.java))
        }
    }
}