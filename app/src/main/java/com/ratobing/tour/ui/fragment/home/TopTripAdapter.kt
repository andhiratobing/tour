package com.ratobing.tour.ui.fragment.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ratobing.tour.R
import com.ratobing.tour.databinding.ItemTopTripsBinding
import com.ratobing.tour.models.TourData

class TopTripAdapter(private var topTrip: ArrayList<TourData>):
    RecyclerView.Adapter<TopTripAdapter.TopTripViewHolder>(){

    inner class TopTripViewHolder(private var binding: ItemTopTripsBinding)
        : RecyclerView.ViewHolder(binding.root)  {
            fun bind(data: TourData){
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
        val binding = ItemTopTripsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TopTripViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TopTripViewHolder, position: Int) {
        val dataTopTrips = topTrip[position]
        holder.bind(dataTopTrips)
    }

    override fun getItemCount(): Int = topTrip.size
}