package com.ratobing.tour.ui.fragment.home.categories.montains

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.ratobing.tour.R
import com.ratobing.tour.databinding.ActivityDetailTripsBinding
import com.ratobing.tour.models.TourData

class DetailMountainsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailTripsBinding

    companion object{
        const val EXTRA_TOUR_DATA_MOUNTAINS = "extra_tour_data_mountains"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailTripsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //get data with Parcelable
        val data: TourData = intent.getParcelableExtra(EXTRA_TOUR_DATA_MOUNTAINS)!!

        binding.apply {
            //Set toolbar with value
            toolbarDetail.title = "Detail ${data.name} ${data.category}"
            setSupportActionBar(toolbarDetail)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            tvName.text = data.name
            Glide.with(this@DetailMountainsActivity)
                .load(data.locationImage)
                .placeholder(R.drawable.placeholder_image)
                .into(ivImage)

            tvPrice.text = "${data.price}/person"
            tvOpenTime.text = data.openTime
            tvRatingLocation.text = data.ratingLocation.toString()
            tvDescriptionOverview.text = data.overview
        }

        binding.btnSeeMaps.setOnClickListener{
            Toast.makeText(this,"Tunggu fitur selanjutnya ya", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}