package com.example.ipet.vet.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ipet.R
import com.example.ipet.vet.Veterinary

class VetAdapter(private val veterinaryList:List<Veterinary>): RecyclerView.Adapter<VetViewHolder> (){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VetViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return VetViewHolder(layoutInflater.inflate(R.layout.item_veterinary,parent,false))
    }

    override fun getItemCount(): Int = veterinaryList.size


    override fun onBindViewHolder(holder: VetViewHolder, position: Int) {
        val item = veterinaryList[position]
        holder.render(item)
    }
}