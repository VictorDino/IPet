package com.example.ipet.shop.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ipet.R
import com.example.ipet.shop.Shop

class ShopAdapter (private val shopList:List<Shop>): RecyclerView.Adapter<ShopViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ShopViewHolder(layoutInflater.inflate(R.layout.item_shop,parent,false))
    }

    override fun getItemCount(): Int = shopList.size


    override fun onBindViewHolder(holder: ShopViewHolder, position: Int) {
        val item = shopList[position]
        holder.render(item)
    }
}