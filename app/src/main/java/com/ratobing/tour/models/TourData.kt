package com.ratobing.tour.models


data class TourData(
    val category : String,
    val name: String,
    val locationName: String,
    val locationImage: String,
    val openTime: String?,
    val ratingLocation: Double?,
    val price: String?,
    val overview: String?
)
