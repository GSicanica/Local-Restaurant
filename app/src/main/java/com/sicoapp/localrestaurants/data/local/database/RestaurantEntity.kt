package com.sicoapp.localrestaurants.data.local.database

import android.os.Parcelable
import androidx.annotation.Nullable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity
@Parcelize
data class RestaurantEntity(

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "address")
    @Nullable
    var address: String,

    @ColumnInfo(name = "latitude")
    var latitude: Double,

    @ColumnInfo(name = "longitude")
    var longitude: Double,

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "photoTaken")
    var photoTaken: Boolean

) : Parcelable