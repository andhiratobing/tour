package com.ratobing.tour.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TourData(
    val category : String,
    val name: String,
    val locationName: String,
    val locationImage: String,
    val openTime: String?,
    val ratingLocation: Double?,
    val price: String?,
    val overview: String?
):Parcelable
