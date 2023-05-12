package com.example.ipet.shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ipet.databinding.ActivityShopBinding
import com.example.ipet.shop.adapter.ShopAdapter

class ShopActivity : AppCompatActivity() {
    private lateinit var binding: ActivityShopBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShopBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView(){

        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this,manager.orientation)
        binding.recyclerShops.layoutManager= manager
        binding.recyclerShops.adapter = ShopAdapter(ShopProvider.shopList)

        binding.recyclerShops.addItemDecoration(decoration)
    }
}