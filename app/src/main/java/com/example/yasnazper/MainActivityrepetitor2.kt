package com.example.yasnazper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class gffhjhj : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityrepetitor2)
        val imageView = findViewById<ImageView>(R.id.imageView27)

        imageView.setOnClickListener{
            startActivity(Intent(this,MainActivitywords::class.java))
        }
    }
}