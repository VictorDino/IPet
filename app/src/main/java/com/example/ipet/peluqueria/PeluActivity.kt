package com.example.ipet.peluqueria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ipet.databinding.ActivityPeluBinding
import com.example.ipet.peluqueria.adapter.PeluAdapter
import com.example.ipet.shop.ShopProvider
import com.example.ipet.shop.adapter.ShopAdapter

class PeluActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPeluBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPeluBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView(){

        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this,manager.orientation)
        binding.recyclerPelus.layoutManager= manager
        binding.recyclerPelus.adapter = PeluAdapter(PeluProvider.peluList)

        binding.recyclerPelus.addItemDecoration(decoration)
    }
}