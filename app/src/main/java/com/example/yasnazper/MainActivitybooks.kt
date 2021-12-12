package com.example.yasnazper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivitybooks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activitybooks)
        val imageView = findViewById<ImageView>(R.id.imageView27)

        imageView.setOnClickListener{
            startActivity(Intent(this,MainActivitywords::class.java))
        }
    }
}