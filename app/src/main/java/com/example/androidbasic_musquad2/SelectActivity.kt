package com.example.androidbasic_musquad2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SelectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)

        val list = mutableListOf<CardViewModel>()

        list.add(CardViewModel(R.drawable.antony, "antony"))
        list.add(CardViewModel(R.drawable.casemiro, "casemiro"))
        list.add(CardViewModel(R.drawable.dalot, "dalot"))
        list.add(CardViewModel(R.drawable.fernandes, "fernandes"))
        list.add(CardViewModel(R.drawable.frenkie, "frenkie"))
        list.add(CardViewModel(R.drawable.rashford, "rashford"))
        list.add(CardViewModel(R.drawable.sancho, "sancho"))
        list.add(CardViewModel(R.drawable.shaw, "shaw"))
        list.add(CardViewModel(R.drawable.stegen, "stegen"))
        list.add(CardViewModel(R.drawable.varan, "varan"))

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview1)
        val recyclerAdapter = RecyclerViewAdapter(list)

        recyclerview.adapter = recyclerAdapter
        recyclerview.layoutManager = LinearLayoutManager(this)

        val player_position_number = intent.getIntExtra("player_position",0)

        recyclerAdapter.itemClick = object : RecyclerViewAdapter.ItemClick{
            override fun onClick(view: View, position: Int) {
                if(position ==0){
                    val intent = Intent()
                    val image_src = R.drawable.antony
                    val name = "antony"
                    intent.putExtra("image_src", image_src)
                    intent.putExtra("name", name)
                    intent.putExtra("player_position", player_position_number)
                    setResult(Activity.RESULT_OK, intent)
                    finish()
                }
                if(position ==1){
                    val intent = Intent()
                    val image_src = R.drawable.casemiro
                    val name = "casemiro"
                    intent.putExtra("image_src", image_src)
                    intent.putExtra("name", name)
                    intent.putExtra("player_position", player_position_number)
                    setResult(Activity.RESULT_OK, intent)
                    finish()
                }
                if(position ==2){
                    val intent = Intent()
                    val image_src = R.drawable.dalot
                    val name = "dalot"
                    intent.putExtra("image_src", image_src)
                    intent.putExtra("name", name)
                    intent.putExtra("player_position", player_position_number)
                    setResult(Activity.RESULT_OK, intent)
                    finish()
                }
                if(position ==3){
                    val intent = Intent()
                    val image_src = R.drawable.fernandes
                    val name = "fernandes"
                    intent.putExtra("image_src", image_src)
                    intent.putExtra("name", name)
                    intent.putExtra("player_position", player_position_number)
                    setResult(Activity.RESULT_OK, intent)
                    finish()
                }
                if(position ==4){
                    val intent = Intent()
                    val image_src = R.drawable.frenkie
                    val name = "frenkie"
                    intent.putExtra("image_src", image_src)
                    intent.putExtra("name", name)
                    intent.putExtra("player_position", player_position_number)
                    setResult(Activity.RESULT_OK, intent)
                    finish()
                }
                if(position ==5){
                    val intent = Intent()
                    val image_src = R.drawable.rashford
                    val name = "rashford"
                    intent.putExtra("image_src", image_src)
                    intent.putExtra("name", name)
                    intent.putExtra("player_position", player_position_number)
                    setResult(Activity.RESULT_OK, intent)
                    finish()
                }
                if(position ==6){
                    val intent = Intent()
                    val image_src = R.drawable.sancho
                    val name = "sancho"
                    intent.putExtra("image_src", image_src)
                    intent.putExtra("name", name)
                    intent.putExtra("player_position", player_position_number)
                    setResult(Activity.RESULT_OK, intent)
                    finish()
                }
                if(position ==7){
                    val intent = Intent()
                    val image_src = R.drawable.shaw
                    val name = "shaw"
                    intent.putExtra("image_src", image_src)
                    intent.putExtra("name", name)
                    intent.putExtra("player_position", player_position_number)
                    setResult(Activity.RESULT_OK, intent)
                    finish()
                }
                if(position ==8){
                    val intent = Intent()
                    val image_src = R.drawable.stegen
                    val name = "stegen"
                    intent.putExtra("image_src", image_src)
                    intent.putExtra("name", name)
                    intent.putExtra("player_position", player_position_number)
                    setResult(Activity.RESULT_OK, intent)
                    finish()
                }
                if(position ==9){
                    val intent = Intent()
                    val image_src = R.drawable.varan
                    val name = "antony"
                    intent.putExtra("image_src", image_src)
                    intent.putExtra("name", name)
                    intent.putExtra("player_position", player_position_number)
                    setResult(Activity.RESULT_OK, intent)
                    finish()
                }
            }
        }

    }
}