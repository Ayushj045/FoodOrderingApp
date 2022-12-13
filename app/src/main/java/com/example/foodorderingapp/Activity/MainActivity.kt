package com.example.foodorderingapp.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodorderingapp.Adaptor.CategoryAdaptor
import com.example.foodorderingapp.Adaptor.PopularAdaptor
import com.example.foodorderingapp.Domain.CategoryDomain
import com.example.foodorderingapp.Domain.FoodDomain
import com.example.foodorderingapp.R

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList: ArrayList<CategoryDomain>
    private lateinit var categoryAdaptor: CategoryAdaptor
    private lateinit var RecyclerView2: RecyclerView
    private lateinit var foodOption: ArrayList<FoodDomain>
    private lateinit var PopularAdaptor: PopularAdaptor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.RecyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        foodList = ArrayList()

        foodList.add(CategoryDomain(R.drawable.cat_1,"Pizza"))
        foodList.add(CategoryDomain(R.drawable.cat_2,"Burger"))
        foodList.add(CategoryDomain(R.drawable.cat_3,"HotDog"))
        foodList.add(CategoryDomain(R.drawable.cat_4,"Drink"))
        foodList.add(CategoryDomain(R.drawable.cat_5,"Donut"))

        categoryAdaptor = CategoryAdaptor(foodList)
        recyclerView.adapter = categoryAdaptor

        RecyclerView2 = findViewById(R.id.RecyclerView2)
        RecyclerView2.setHasFixedSize(true)
        RecyclerView2.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        foodOption = ArrayList()

        foodOption.add(FoodDomain(R.drawable.pop_1,"Pepperoni pizza","slice pepperoni,mozzerella cheese,fresh organo,ground black pepper,pizza sauce",99.00,0))
        foodOption.add(FoodDomain(R.drawable.pop_2,"Cheese Burger","Cheese,special sauce,tomato,miyonees",60.00,0))
        foodOption.add(FoodDomain(R.drawable.pop_3,"Vegetable pizza","Olive oil,vegetable oil,fresh Organo,fresh chilli,cherry tomato,Special sauce",69.00,0))

        PopularAdaptor = PopularAdaptor(foodOption)
        RecyclerView2.adapter = PopularAdaptor



    }

}

