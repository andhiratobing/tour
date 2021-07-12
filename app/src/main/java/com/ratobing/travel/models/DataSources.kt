package com.ratobing.travel.models

import android.content.Context
import android.content.res.TypedArray
import com.ratobing.travel.R

class DataSources(val context:Context){

    fun getCategoryMontains(): Array<String>{

        return context.resources.getStringArray(R.array.data_name_categroy1)
    }

    fun getNameMontains(): Array<String>{
        return context.resources.getStringArray(R.array.data_name_montains)
    }

    fun getImagaMontains(): TypedArray{
        return context.resources.obtainTypedArray(R.array.data_image_location_montains)
    }

    fun getLocationMontains(): Array<String>{
        return context.resources.getStringArray(R.array.data_location_montains)
    }

    fun getOpenTimeMontains(): Array<String>{
        return context.resources.getStringArray(R.array.data_open_time_mountains)
    }

    fun getRatingMontains(): IntArray {
        return context.resources.getIntArray(R.array.data_open_time_mountains)
    }

    fun getOverviesMontains(): Array<String>{
        return context.resources.getStringArray(R.array.data_overviews_montains)
    }

    fun getReviewsMontains(): Array<String>{
        return context.resources.getStringArray(R.array.data_reviews_montains)
    }
}