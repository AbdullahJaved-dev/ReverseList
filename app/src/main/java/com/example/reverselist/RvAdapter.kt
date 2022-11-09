package com.example.reverselist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.reverselist.databinding.ItemRvBinding


class RvAdapter(private val items: List<Int>) : RecyclerView.Adapter<RvAdapter.ItemViewHolder>() {
    class ItemViewHolder(val binding: ItemRvBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            ItemRvBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.binding.tv.text = items[holder.adapterPosition].toString()
    }

    override fun getItemCount(): Int = items.size

}
