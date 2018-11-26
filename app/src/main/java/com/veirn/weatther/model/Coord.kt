package com.veirn.weatther.model

import com.google.gson.annotations.SerializedName

data class Coord(
    @SerializedName("lat")
    val lat: Double, // 37.386051
    @SerializedName("lon")
    val lon: Double // -122.08384
)