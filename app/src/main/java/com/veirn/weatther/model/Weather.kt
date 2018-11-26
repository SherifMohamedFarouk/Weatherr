package com.veirn.weatther.model

import com.google.gson.annotations.SerializedName

data class Weather(
    @SerializedName("description")
    val description: String, // Light Rain
    @SerializedName("icon")
    val icon: String, // 02d
    @SerializedName("id")
    val id: Int, // 315
    @SerializedName("main")
    val main: String // Light Rain
)