package com.example.guided2_intent

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNextPage = findViewById<Button>(R.id.btnPrevious)

        btnNextPage.setOnClickListener{
            val intent = Intent( this, NextActivity::class.java)
            startActivity(intent)
        }
    }
}