package com.example.foodorderingapp.Adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.foodorderingapp.Domain.CategoryDomain
import com.example.foodorderingapp.Domain.FoodDomain
import com.example.foodorderingapp.R
import java.util.*
import kotlin.collections.ArrayList

class PopularAdaptor(private val foodOption: ArrayList<FoodDomain>)
    : RecyclerView.Adapter<PopularAdaptor.FoodViewHolder>(){

    class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.pic)
        val textView: TextView = itemView.findViewById(R.id.title)
        val addBtn: TextView = itemView.findViewById(R.id.addBtn)
        val fee: TextView = itemView.findViewById(R.id.fee)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_popular,parent,false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food1 = foodOption[position]
        holder.imageView.setImageResource(food1.pic)
        holder.textView.text = food1.title
        holder.fee.text = food1.fee.toString()

    }

    override fun getItemCount(): Int {
       return foodOption.size
    }

}