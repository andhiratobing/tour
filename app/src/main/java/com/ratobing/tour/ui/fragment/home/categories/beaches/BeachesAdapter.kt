package com.ratobing.tour.ui.fragment.home.categories.beaches

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ratobing.tour.R
import com.ratobing.tour.databinding.ItemTripsBinding
import com.ratobing.tour.models.TourData

class BeachesAdapter(private val beachList: ArrayList<TourData>)
    : RecyclerView.Adapter<BeachesAdapter.BeachesViewHolder>() {

    private lateinit var onItemClickCallBack: OnItemClickCallBack

    interface OnItemClickCallBack {
        fun onItemClicked(data: TourData)
    }

    fun setOnItemClickCallBack(onItemClickCallBack: OnItemClickCallBack){
        this.onItemClickCallBack = onItemClickCallBack
    }

    inner class BeachesViewHolder(private val binding: ItemTripsBinding): RecyclerView.ViewHolder(binding.root) {
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeachesViewHolder {
        val binding = ItemTripsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BeachesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BeachesViewHolder, position: Int) {
        val data = beachList[position]
        holder.bind(data)

        holder.itemView.setOnClickListener{
            onItemClickCallBack.onItemClicked(beachList[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int = beachList.size
}