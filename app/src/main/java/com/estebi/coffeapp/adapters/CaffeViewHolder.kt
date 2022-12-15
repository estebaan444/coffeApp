package com.estebi.coffeapp.adapters

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.estebi.coffeapp.databinding.ItemCaffesBinding

class CaffeViewHolder(view:View):RecyclerView.ViewHolder(view){

    val binding = ItemCaffesBinding.bind(view)


    fun render(caffeModel: Caffe, onClickListener: (Caffe)->Unit){
        caffeModel.preu
        binding.caffeTitle.text = caffeModel.caffe
        binding.caffeDesc.text = caffeModel.desc
        binding.caffePreu.text = caffeModel.preu.toString()
        Glide.with(binding.imgCoffe.context).load(caffeModel.photo).into(binding.imgCoffe)

        itemView.setOnClickListener { onClickListener(caffeModel) }
    }
}