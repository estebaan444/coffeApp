package com.estebi.coffeapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.estebi.coffeapp.R

class CaffeAdapter(private val caffeList: List<Caffe>,private val onClickListener: (Caffe)->Unit) : RecyclerView.Adapter<CaffeViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CaffeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CaffeViewHolder(layoutInflater.inflate(R.layout.item_caffes, parent, false))
    }

    override fun onBindViewHolder(holder: CaffeViewHolder, position: Int) {
        val item = caffeList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int {
        return caffeList.size
    }
}