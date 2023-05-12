package com.example.ipet.peluqueria.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ipet.R
import com.example.ipet.peluqueria.Peluqueria

class PeluAdapter (private val peluList:List<Peluqueria>): RecyclerView.Adapter<PeluViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeluViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PeluViewHolder(layoutInflater.inflate(R.layout.item_pelu,parent,false))
    }

    override fun getItemCount(): Int = peluList.size


    override fun onBindViewHolder(holder: PeluViewHolder, position: Int) {
        val item = peluList[position]
        holder.render(item)
    }

}