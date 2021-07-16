package com.ratobing.travel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ratobing.travel.databinding.ItemTripsBinding
import com.ratobing.travel.models.TravelData

class MuseumAdapter(private val dataMuseumList: ArrayList<TravelData>):
    RecyclerView.Adapter<MuseumAdapter.MuseumViewHolder>() {


    inner class MuseumViewHolder(private val binding: ItemTripsBinding): RecyclerView.ViewHolder(binding.root) {
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MuseumViewHolder {
        val binding = ItemTripsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MuseumViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MuseumViewHolder, position: Int) {
        val data = dataMuseumList[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = dataMuseumList.size
}