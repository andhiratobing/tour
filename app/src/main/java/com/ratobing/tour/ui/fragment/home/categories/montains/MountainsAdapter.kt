package com.ratobing.tour.ui.fragment.home.categories.montains

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ratobing.tour.R
import com.ratobing.tour.databinding.ItemTripsBinding
import com.ratobing.tour.models.TourData

class MountainsAdapter(private val mountainsList:ArrayList<TourData>):
    RecyclerView.Adapter<MountainsAdapter.MountainsViewHolder>() {


    private lateinit var onItemClickCallBack: OnItemClickCallBack

    interface OnItemClickCallBack {
        fun onItemClicked(data: TourData)
    }

    fun setOnItemClickCallBack(onItemClickCallBack: OnItemClickCallBack){
        this.onItemClickCallBack = onItemClickCallBack
    }


    inner class MountainsViewHolder(private val binding: ItemTripsBinding)
        : RecyclerView.ViewHolder(binding.root){
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MountainsViewHolder {
        val binding = ItemTripsBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return MountainsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MountainsViewHolder, position: Int) {
        val data = mountainsList[position]
        holder.bind(data)

        holder.itemView.setOnClickListener{
            onItemClickCallBack.onItemClicked(mountainsList[holder.adapterPosition])
        }


    }

    override fun getItemCount(): Int = mountainsList.size
}
