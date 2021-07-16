package com.ratobing.travel.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ratobing.travel.R
import com.ratobing.travel.databinding.ItemTripsBinding
import com.ratobing.travel.models.TravelData

class TempleAdapter(private val templeList: ArrayList<TravelData>)
    : RecyclerView.Adapter<TempleAdapter.TempleViewHolder>(){

    class TempleViewHolder(private val binding: ItemTripsBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(data: TravelData){
            with(binding){
                tvName.text = data.name
                tvCategoryName.text = data.category

                Glide.with(itemView.context)
                    .load(data.locationImage)
                    .placeholder(R.drawable.placeholder_image)
                    .into(ivImage)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TempleViewHolder {
        val binding = ItemTripsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TempleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TempleViewHolder, position: Int) {
        val data = templeList[position]
        holder.bind(data)

    }

    override fun getItemCount(): Int = templeList.size
}