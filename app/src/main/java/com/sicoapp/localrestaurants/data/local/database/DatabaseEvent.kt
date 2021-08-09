package com.sicoapp.localrestaurants.data.local.database

data class DatabaseEvent<T>(val eventType: DatabaseEventType, val value: T)
