package com.example.yasnazper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivityaccaunt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityaccaunt)
        val imageView = findViewById<Button>(R.id.ava)

        imageView.setOnClickListener {
            startActivity(Intent(this, MainActivityaccaunt::class.java))
        }


        val perehod = findViewById<Button>(R.id.imageView29)

        perehod.setOnClickListener {
            startActivity(Intent(this, MainActivitygrammar::class.java))
        }
    }
}