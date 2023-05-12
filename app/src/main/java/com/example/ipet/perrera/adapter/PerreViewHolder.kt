package com.example.ipet.perrera.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.ipet.databinding.ItemPerreraBinding
import com.example.ipet.perrera.Perrera

class PerreViewHolder (view: View): RecyclerView.ViewHolder(view){
    private val binding = ItemPerreraBinding.bind(view)


    fun render(perrera: Perrera){
        binding.perreName.text = perrera.perreName
        binding.perreDirection.text = perrera.direction
        binding.perrePhone.text = perrera.numPhone
    }
}