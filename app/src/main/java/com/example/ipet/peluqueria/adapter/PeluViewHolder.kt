package com.example.ipet.peluqueria.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.ipet.databinding.ItemPeluBinding
import com.example.ipet.peluqueria.Peluqueria

class PeluViewHolder (view: View): RecyclerView.ViewHolder(view){
    private val binding = ItemPeluBinding.bind(view)


    fun render(peluqueria: Peluqueria){
        binding.peluName.text = peluqueria.peluName
        binding.peluDirection.text = peluqueria.direction
        binding.peluPhone.text = peluqueria.numPhone
    }
}