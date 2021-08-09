package com.sicoapp.localrestaurants.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [RestaurantEntity::class], version = 1, exportSchema = false)
abstract class Database : RoomDatabase() {
    abstract fun movieDao() : RestaurantDao
}