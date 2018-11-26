package com.veirn.weatther.model

import com.google.gson.annotations.SerializedName

data class Temp(
    @SerializedName("day")
    val day: Double, // 29.49
    @SerializedName("eve")
    val eve: Double, // 21.09
    @SerializedName("max")
    val max: Double, // 15.770668958887248
    @SerializedName("min")
    val min: Double, // 14.215773578236261
    @SerializedName("morn")
    val morn: Double, // 15.42
    @SerializedName("night")
    val night: Double // 9.52
)