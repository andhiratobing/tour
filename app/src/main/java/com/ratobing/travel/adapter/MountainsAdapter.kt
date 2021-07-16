package com.ratobing.travel.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ratobing.travel.R
import com.ratobing.travel.databinding.ItemTripsBinding
import com.ratobing.travel.models.TravelData

class MountainsAdapter(private val mountainsList:ArrayList<TravelData>):
    RecyclerView.Adapter<MountainsAdapter.MountainsViewHolder>() {


    inner class MountainsViewHolder(private val binding: ItemTripsBinding)
        : RecyclerView.ViewHolder(binding.root){
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MountainsViewHolder {
        val binding = ItemTripsBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return MountainsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MountainsViewHolder, position: Int) {
        val data = mountainsList[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = mountainsList.size
}