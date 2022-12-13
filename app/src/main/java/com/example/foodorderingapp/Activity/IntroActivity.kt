package com.example.foodorderingapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.foodorderingapp.R
import android.content.Intent as Intent

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

       val startBtn = findViewById<Button>(R.id.startBtn)
        startBtn.setOnClickListener{
           val intent = Intent(this, MainActivity::class.java).also {
               startActivity(it)
           }
        }
    }
}