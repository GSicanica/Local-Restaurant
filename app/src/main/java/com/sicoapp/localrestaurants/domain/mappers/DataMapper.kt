package com.sicoapp.localrestaurants.domain.mappers

import com.sicoapp.localrestaurants.data.local.database.RestaurantEntity
import com.sicoapp.localrestaurants.data.remote.Restaurant

object DataMapper {

    fun mapEntitiesToDomain(input: List<RestaurantEntity>): List<Restaurant> =
        input.map {
            Restaurant(
                address = it.address,
                latitude = it.latitude,
                longitude = it.longitude,
                name = it.name,
                photoTaken = it.photoTaken
            )
        }

    fun mapRestaurantToRestaurantEntity(res : Restaurant): RestaurantEntity {
      return  RestaurantEntity(
            address = res.address,
            latitude = res.latitude,
            longitude = res.longitude,
            name = res.name,
            photoTaken = res.photoTaken
        )
    }
}

fun List<Restaurant>.mapToRestaurantEntity(): List<RestaurantEntity> {

    var formattedRestaurantList = mutableListOf<RestaurantEntity>()
    val restaurantResponseList = this ?: return formattedRestaurantList

    formattedRestaurantList = restaurantResponseList
        .asSequence()
        .map {
            val name = it.name
            val address = it.address
            val latitude = it.latitude
            val longitude = it.longitude
            val photoTaken = it.photoTaken
            RestaurantEntity(
                address = address,
                latitude = latitude,
                longitude = longitude,
                name = name,
                photoTaken = photoTaken
            )
        }.toMutableList()

    return formattedRestaurantList
}