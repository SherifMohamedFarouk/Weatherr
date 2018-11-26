package com.veirn.weatther.model

import com.google.gson.annotations.SerializedName

data class City(
    @SerializedName("coord")
    val coord: Coord,
    @SerializedName("country")
    val country: String, // US
    @SerializedName("id")
    val id: Int, // 5375480
    @SerializedName("name")
    val name: String, // Mountain View
    @SerializedName("population")
    val population: Int // 0
)