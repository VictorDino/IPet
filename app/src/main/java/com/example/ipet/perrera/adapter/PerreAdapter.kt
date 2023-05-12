package com.example.ipet.perrera.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ipet.R
import com.example.ipet.perrera.Perrera

class PerreAdapter (private val perreList:List<Perrera>): RecyclerView.Adapter<PerreViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PerreViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PerreViewHolder(layoutInflater.inflate(R.layout.item_perrera,parent,false))
    }

    override fun getItemCount(): Int = perreList.size


    override fun onBindViewHolder(holder: PerreViewHolder, position: Int) {
        val item = perreList[position]
        holder.render(item)
    }
}