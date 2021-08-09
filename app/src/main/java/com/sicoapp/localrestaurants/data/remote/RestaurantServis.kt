package com.sicoapp.localrestaurants.data.remote

import io.reactivex.Single
import retrofit2.http.GET

interface RestaurantServis {
    @GET("54ef80f5a11ac4d607752717")
    fun getAll():  Single<List<Restaurant>>
}