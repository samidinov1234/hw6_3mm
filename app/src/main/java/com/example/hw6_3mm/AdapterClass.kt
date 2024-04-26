package com.example.hw6_3mm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class AdapterClass(private val dataClass: ArrayList<DataClass>):RecyclerView.Adapter<AdapterClass.ViewHolderClass>(){

    class ViewHolderClass(itemView: View):RecyclerView.ViewHolder(itemView){
        val rvImage = itemView.findViewById<ImageView>(R.id.image)
        val rvTitle: TextView = itemView.findViewById(R.id.title)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.country_item, parent, false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
        return dataClass.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem = dataClass[position]
        holder.rvImage.setImageResource(currentItem.dataImage)
        holder.rvTitle.text = currentItem.dataTitle
    }

}