package com.ratobing.travel.models


data class TravelData(
    val category : String,
    val name: String,
    val locationName: String,
    val locationImage: String,
    val openTime: String?,
    val ratingLocation: Double?,
    val overview: String?,
    val reviews: String?
)
