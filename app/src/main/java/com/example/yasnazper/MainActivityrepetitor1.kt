package com.example.yasnazper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivityrepetitor1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityrepetitor1)
        val imageView = findViewById<ImageView>(R.id.ava)

        imageView.setOnClickListener {
            startActivity(Intent(this, MainActivityaccaunt::class.java))
        }


        val perehod = findViewById<ImageView>(R.id.imageView29)

        perehod.setOnClickListener {
            startActivity(Intent(this, MainActivitygrammar::class.java))
        }
    }
}