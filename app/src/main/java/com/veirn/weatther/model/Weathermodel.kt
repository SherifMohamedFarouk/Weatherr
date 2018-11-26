package com.veirn.weatther.model

import com.google.gson.annotations.SerializedName

data class Weathermodel(

    @SerializedName("city")
    val city: City,
    @SerializedName("cnt")
    val cnt: Int, // 14
    @SerializedName("cod")
    val cod: String, // 200
    @SerializedName("list")
    val list: List<X>,
    @SerializedName("message")
    val message: Double // 0.0158
)