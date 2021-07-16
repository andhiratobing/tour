package com.ratobing.travel.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ratobing.travel.R
import com.ratobing.travel.databinding.ItemTripsBinding
import com.ratobing.travel.models.TravelData

class BeachesAdapter(private val beachList: ArrayList<TravelData>)
    : RecyclerView.Adapter<BeachesAdapter.BeachesViewHolder>() {


    inner class BeachesViewHolder(private val binding: ItemTripsBinding): RecyclerView.ViewHolder(binding.root) {
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeachesViewHolder {
        val binding = ItemTripsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BeachesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BeachesViewHolder, position: Int) {
        val data = beachList[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = beachList.size
}