package com.example.ipet.vet.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.ipet.databinding.ItemVeterinaryBinding
import com.example.ipet.vet.Veterinary

class VetViewHolder (view: View):RecyclerView.ViewHolder(view){

    private val binding = ItemVeterinaryBinding.bind(view)


    fun render(veterinary: Veterinary){
        binding.veterinaryName.text = veterinary.veterinaryName
        binding.veterinaryDirection.text = veterinary.direction
        binding.veterinaryPhone.text = veterinary.numPhone
    }

}