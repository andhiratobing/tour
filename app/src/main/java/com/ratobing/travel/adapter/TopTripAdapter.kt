package com.ratobing.travel.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ratobing.travel.databinding.ItemTripsBinding
import com.ratobing.travel.models.TravelData

class TopTripAdapter(private var topTrip: ArrayList<TravelData>):
    RecyclerView.Adapter<TopTripAdapter.TopTripViewHolder>(){

    inner class TopTripViewHolder(private var binding: ItemTripsBinding)
        : RecyclerView.ViewHolder(binding.root)  {
            fun bind(data: TravelData){
                with(binding){
                    tvLocationName.text = data.locationName
                    tvCategoryName.text = data.category


                    Glide.with(itemView.context)
                        .load(data.locationImage)
                        .apply(RequestOptions().override(55, 55))
                        .into(ivLocationImage)
                }
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopTripViewHolder {
        val binding = ItemTripsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TopTripViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TopTripViewHolder, position: Int) {
        val dataTopTrips = topTrip[position]
        holder.bind(dataTopTrips)
    }

    override fun getItemCount(): Int = topTrip.size
}