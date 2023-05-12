package com.example.ipet.perrera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ipet.databinding.ActivityPerreBinding
import com.example.ipet.perrera.adapter.PerreAdapter

class PerreActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPerreBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPerreBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView(){

        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this,manager.orientation)
        binding.recyclerPerre.layoutManager= manager
        binding.recyclerPerre.adapter = PerreAdapter(PerreraProvider.perreList)

        binding.recyclerPerre.addItemDecoration(decoration)
    }
}