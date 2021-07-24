package com.ratobing.tour.ui.fragment.home.categories.temple

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ratobing.tour.R
import com.ratobing.tour.databinding.ItemTripsBinding
import com.ratobing.tour.models.TourData

class TempleAdapter(private val templeList: ArrayList<TourData>)
    : RecyclerView.Adapter<TempleAdapter.TempleViewHolder>(){

    class TempleViewHolder(private val binding: ItemTripsBinding): RecyclerView.ViewHolder(binding.root) {
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