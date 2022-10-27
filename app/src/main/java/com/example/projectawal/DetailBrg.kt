package com.example.projectawal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailBrg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_brg)

        val brgbarkas=intent.getParcelableExtra<brgbarkas>(MainItem.INTENT_PARCELABLE)

        val imgbarkas = findViewById<ImageView>(R.id.img_item_photo)
        val jdlbarkas = findViewById<TextView>(R.id.tv_item_name)
        val descbarkas = findViewById<TextView>(R.id.tv_item_description)

        imgbarkas.setImageResource(brgbarkas?.imgbarkas!!)
        jdlbarkas.text=brgbarkas.jdlbarkas
        descbarkas.text=brgbarkas.descbarkas
    }

}