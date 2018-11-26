package com.veirn.weatther.model

import com.google.gson.annotations.SerializedName

data class X(
    @SerializedName("clouds")
    val clouds: Int, // 20
    @SerializedName("deg")
    val deg: Int, // 191
    @SerializedName("dt")
    val dt: Int, // 1544264217
    @SerializedName("humidity")
    val humidity: Double, // 96.8709835945829
    @SerializedName("pressure")
    val pressure: Double, // 987.0411321080915
    @SerializedName("speed")
    val speed: Double, // 40.82328118094366
    @SerializedName("temp")
    val temp: Temp,
    @SerializedName("weather")
    val weather: List<Weather>
)