package com.example.foodorderingapp.Adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.foodorderingapp.Domain.CategoryDomain
import com.example.foodorderingapp.R
import java.util.*
import kotlin.collections.ArrayList

class CategoryAdaptor(private val foodList:ArrayList<CategoryDomain>)
    : RecyclerView.Adapter<CategoryAdaptor.FoodViewHolder>(){

    class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.categoryPic)
        val textView: TextView = itemView.findViewById(R.id.categoryName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_category,parent,false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = foodList[position]
        holder.imageView.setImageResource(food.pic)
        holder.textView.text = food.title
    }

    override fun getItemCount(): Int {
       return foodList.size
    }

}