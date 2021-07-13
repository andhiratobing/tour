package com.ratobing.travel.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ratobing.travel.R
import com.ratobing.travel.databinding.ItemTripsBinding
import com.ratobing.travel.models.TravelData

class TopTripAdapter(private var topTrip: ArrayList<TravelData>):
    RecyclerView.Adapter<TopTripAdapter.TopTripViewHolder>(){

    inner class TopTripViewHolder(private var binding: ItemTripsBinding)
        : RecyclerView.ViewHolder(binding.root)  {
            fun bind(data: TravelData){
                with(binding){
                    tvName.text = data.name
                    tvCategoryName.text = data.category


//                    val requestOptions = RequestOptions().placeholder(R.drawable.ic_launcher_background)
//                        .error(R.drawable.ic_launcher_background)

                    Glide.with(itemView.context)
                        .load(data.locationImage)
                        .placeholder(R.drawable.placeholder_image)
                        .into(ivImage)
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