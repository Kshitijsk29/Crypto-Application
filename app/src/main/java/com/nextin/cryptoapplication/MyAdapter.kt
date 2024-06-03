package com.nextin.cryptoapplication

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter (private var coinNameArray: ArrayList<Crypto> , context :Activity):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val viewItem = LayoutInflater.from(parent.context).inflate(R.layout.each_rv_items, parent, false)
        return MyViewHolder(viewItem)
    }

    override fun getItemCount(): Int {
        return coinNameArray.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = coinNameArray[position]
        holder.coinIconItem.setImageResource(currentItem.coinIcon)
        holder.coinNameItem.text = currentItem.coinName
        holder.coinPriceItem.text = currentItem.coinPrice
    }


    inner class MyViewHolder(viewItem:View):RecyclerView.ViewHolder(viewItem){
        val coinIconItem: ShapeableImageView = viewItem.findViewById(R.id.coinIconImage)
        val coinNameItem: TextView = viewItem.findViewById(R.id.coinName)
        val coinPriceItem: TextView = viewItem.findViewById(R.id.coinPrice)
    }

}
