package com.veirn.weatther

import com.veirn.weatther.model.Weathermodel
import retrofit2.http.GET
import java.util.*
import io.reactivex.Observable
import retrofit2.http.*

interface RequestInterface {
    @GET("api/android")
    fun getData() : Observable<Weathermodel>
}