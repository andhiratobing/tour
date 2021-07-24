package com.ratobing.tour.ui.fragment.home.categories.museum

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ratobing.tour.R
import com.ratobing.tour.databinding.ItemTripsBinding
import com.ratobing.tour.models.TourData

class MuseumAdapter(private val dataMuseumList: ArrayList<TourData>):
    RecyclerView.Adapter<MuseumAdapter.MuseumViewHolder>() {


    inner class MuseumViewHolder(private val binding: ItemTripsBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(data: TourData){
            with(binding){
                tvName.text = data.name
                tvCategoryName.text = data.category
                tvRatingLocation.text = data.ratingLocation.toString()

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