package com.sicoapp.localrestaurants.data.remote

import io.reactivex.Single
import javax.inject.Inject

class NetworkDataSource @Inject constructor(
    private val restaurantServis: RestaurantServis
) {
    fun fetchRestaurants():  Single<List<Restaurant>>  {
        return restaurantServis.getAll()
    }
}