package com.example.toko_keramik_online.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.toko_keramik_online.R
import com.example.toko_keramik_online.model.Kategori

class AdapterKategori (var data2:ArrayList<Kategori>):
    RecyclerView.Adapter<AdapterKategori.Holder>() {

    class Holder(view2 : View):RecyclerView.ViewHolder(view2){
        val tvkategori = view2.findViewById<TextView>(R.id.tv_kategori)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view2: View = LayoutInflater.from(parent.context).inflate(R.layout.item_kategori, parent, false)
        return Holder(view2)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.tvkategori.text = data2[position].kategori_m

    }

    override fun getItemCount(): Int {
       return data2.size
    }
}