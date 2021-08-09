package com.sicoapp.localrestaurants.data.remote

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Restaurant(
    @SerializedName("Address")
    var address: String,
    @SerializedName("Latitude")
    var latitude: Double,
    @SerializedName("Longitude")
    var longitude: Double,
    @SerializedName("Name")
    var name: String,
    var photoTaken : Boolean
) : Parcelable