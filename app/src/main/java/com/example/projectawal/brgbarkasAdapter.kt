package com.example.projectawal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//Deklarasi Context, List Item, dan Pembaca data
class brgbarkasAdapter(private val context: Context, private val BrgBarkas: List<brgbarkas>, val listener: (brgbarkas)-> Unit)
    : RecyclerView.Adapter<brgbarkasAdapter.brgbarkasViewHolder>() {

    class brgbarkasViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imgbarkas = view.findViewById<ImageView>(R.id.img_item_photo)
        val jdlbarkas = view.findViewById<TextView>(R.id.tv_item_name)
        val descbarkas = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(BrgBarkas: brgbarkas, listener: (brgbarkas) -> Unit){
            imgbarkas.setImageResource(BrgBarkas.imgbarkas)
            jdlbarkas.text=BrgBarkas.jdlbarkas
            descbarkas.text=BrgBarkas.descbarkas

            //Kode Program agar Card View dapat di clik sehingga menampilkan Detail dari barang
            itemView.setOnClickListener {
                listener(BrgBarkas)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): brgbarkasViewHolder  {
        return brgbarkasViewHolder(
            LayoutInflater.from(context).inflate(R.layout.activity_itembarkas, parent, false)
        )
    }


    override fun onBindViewHolder(holder: brgbarkasViewHolder, position: Int) {
            holder.bindView(BrgBarkas[position], listener)
    }

    override fun getItemCount(): Int = BrgBarkas.size

    }




