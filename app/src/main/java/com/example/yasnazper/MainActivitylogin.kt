package com.example.yasnazper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivitylogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activitylogin)
        val imageView = findViewById<Button>(R.id.ava)

        imageView.setOnClickListener {
            startActivity(Intent(this, MainActivityaccaunt::class.java))
        }


        val Buttonnext = findViewById<Button>(R.id.next)

        Buttonnext.setOnClickListener {
            startActivity(Intent(this, MainActivitygrammar::class.java))
        }

    }
}