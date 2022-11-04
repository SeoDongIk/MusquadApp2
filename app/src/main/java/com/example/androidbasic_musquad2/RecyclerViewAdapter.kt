package com.example.androidbasic_musquad2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(val items : MutableList<CardViewModel>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.individual, parent, false)

        return ViewHolder(view)
    }

    interface ItemClick{
        fun onClick(view: View, position : Int)
    }

    var itemClick : ItemClick? = null

    override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder, position: Int) {
        if(itemClick != null){
            holder.itemView.setOnClickListener{
                itemClick?.onClick(it, position)
            }
        }
        holder.bindItems(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        fun bindItems(item : CardViewModel){
            val player_image = itemView.findViewById<ImageView>(R.id.player_image)
            val player_name = itemView.findViewById<TextView>(R.id.player_name)

            player_image.setImageResource(item.image_src)
            player_name.setText(item.player_name)
        }
    }

}