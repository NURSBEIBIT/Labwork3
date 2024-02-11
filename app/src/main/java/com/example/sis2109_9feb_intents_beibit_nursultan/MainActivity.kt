package com.example.sis2109_9feb_intents_beibit_nursultan

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBio = findViewById<Button>(R.id.button2)
        btnBio.setOnClickListener {
            intent = Intent(applicationContext, Second_Screen::class.java)
            startActivity(intent)
        }


        val webButton = findViewById<Button>(R.id.button3)
        webButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://iitu.edu.kz/en/")
            startActivity(intent)
        }

        val CameraButton = findViewById<Button>(R.id.button4)
        CameraButton.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}