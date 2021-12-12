package com.example.yasnazper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivitygrammar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activitygrammar)
        val imageView = findViewById<ImageView>(R.id.imageView27)

        imageView.setOnClickListener{
            startActivity(Intent(this,MainActivitywords::class.java))
        }
        val books = findViewById<ImageView>(R.id.imageView28)

        books.setOnClickListener{
            startActivity(Intent(this,MainActivitybooks::class.java))
        }
        val grammar = findViewById<ImageView>(R.id.imageView29)

        grammar.setOnClickListener{
            startActivity(Intent(this,MainActivitygrammar::class.java))
        }
        val listening = findViewById<ImageView>(R.id.imageView31)

        listening.setOnClickListener{
            startActivity(Intent(this,MainActivityaudio::class.java))
        }
        val profile = findViewById<ImageView>(R.id.imageView34)

        profile.setOnClickListener{
            startActivity(Intent(this,MainActivityaccaunt::class.java))
        }
    }
}