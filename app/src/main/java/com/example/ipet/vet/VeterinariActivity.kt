package com.example.ipet.vet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ipet.MainActivity
import com.example.ipet.R
import com.example.ipet.databinding.ActivityVeterinariBinding
import com.example.ipet.vet.adapter.VetAdapter
import com.google.android.gms.maps.GoogleMap


class VeterinariActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVeterinariBinding


        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVeterinariBinding.inflate(layoutInflater)
        setContentView(binding.root)

            initRecyclerView()
        }

    private fun initRecyclerView(){

        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this,manager.orientation)
        binding.recyclerVeterinaris.layoutManager= manager
        binding.recyclerVeterinaris.adapter = VetAdapter(VeterinaryProvider.veterinaryList)

        binding.recyclerVeterinaris.addItemDecoration(decoration)
    }
}