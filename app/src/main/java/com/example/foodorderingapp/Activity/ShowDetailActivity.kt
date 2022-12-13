package com.example.foodorderingapp.Activity

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.foodorderingapp.Domain.FoodDomain
import com.example.foodorderingapp.R
import java.util.*

class showDetailActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_show_detail)


    val titleTxt = findViewById<TextView>(R.id.titleTxt)
    val priceTxt = findViewById<TextView>(R.id.priceTxt)
    val minusBtn = findViewById<ImageView>(R.id.minusBtn)
    val plusBtn = findViewById<ImageView>(R.id.plusBtn)
    val numberOrderTxt = findViewById<TextView>(R.id.numberOrdertxt)
    val descriptionTxt = findViewById<TextView>(R.id.descriptionTxt)


}
  }