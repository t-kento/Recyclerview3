package com.example.recyclerview3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.example_item.view.*

class ExampleAdapter(private val exampleList :List<ExampleItem>) : RecyclerView.Adapter<ExampleAdapter.ExampleViewHoldre>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHoldre {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.example_item,
            parent,false)

        return ExampleViewHoldre(itemView)
    }

    override fun getItemCount():Int = exampleList.size

    override fun onBindViewHolder(holder: ExampleViewHoldre, position: Int) {
        val currentItem = exampleList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView1.text=currentItem.text1
        holder.textView2.text=currentItem.text2
    }

    class  ExampleViewHoldre(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.image_view
        val textView1:TextView = itemView.text_view_1
        val textView2:TextView = itemView.text_view_2


    }
}