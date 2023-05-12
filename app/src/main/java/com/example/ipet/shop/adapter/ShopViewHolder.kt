package com.example.ipet.shop.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.ipet.databinding.ItemShopBinding
import com.example.ipet.shop.Shop

class ShopViewHolder (view: View): RecyclerView.ViewHolder(view){

    private val binding = ItemShopBinding.bind(view)


    fun render(shop: Shop){
        binding.shopName.text = shop.shopName
        binding.shopDirection.text = shop.direction
        binding.shopPhone.text = shop.numPhone
    }
}