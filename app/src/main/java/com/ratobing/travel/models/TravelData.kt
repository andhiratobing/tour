package com.ratobing.travel.models

import androidx.annotation.DrawableRes

data class TravelData(
    val id: String,
    val category : String,
    val locationName: String,
    @DrawableRes
    val locationImage: Int?,
    val openTime: String?,
    val ratingLocation: Int?,
    val overview: String?,
    val reviews: String?
)
