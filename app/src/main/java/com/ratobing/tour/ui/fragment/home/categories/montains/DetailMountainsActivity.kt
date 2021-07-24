package com.ratobing.tour.ui.fragment.home.categories.montains

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.ratobing.tour.R
import com.ratobing.tour.databinding.ActivityDetailTripsBinding

class DetailMountainsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailTripsBinding

    companion object{
        const val EXTRA_CATEGORY = "extra_category"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_NAME_LOCATION = "extra_name_location"
        const val EXTRA_LOCATION_IMAGE = "extra_location_image"
        const val EXTRA_OPEN_TIME = "extra_open_time"
        const val EXTRA_RATING_LOCATION = "extra_rating_location"
        const val EXTRA_PRICE = "extra_price"
        const val EXTRA_OVERVIEW = "extra_overview"
        const val EXTRA_REVIEWS = "extra_reviews"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailTripsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //get data
        val nameLocation = intent.getStringExtra(EXTRA_NAME)
        val imageLocation = intent.getStringExtra(EXTRA_LOCATION_IMAGE)
        val price = intent.getStringExtra(EXTRA_PRICE)


        binding.apply {
            //Set toolbar with value
            toolbarDetail.title = "Detail $nameLocation"
            setSupportActionBar(toolbarDetail)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            tvName.text = nameLocation
            Glide.with(this@DetailMountainsActivity)
                .load(imageLocation)
                .placeholder(R.drawable.placeholder_image)
                .into(ivImage)

            tvPrice.text = "$price/person"
        }

    }
}