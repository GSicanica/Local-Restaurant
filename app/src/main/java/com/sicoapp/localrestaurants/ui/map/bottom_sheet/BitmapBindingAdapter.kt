package com.sicoapp.localrestaurants.ui.map.bottom_sheet

import android.graphics.Bitmap
import android.widget.ImageView
import androidx.databinding.BindingAdapter

object BitmapBindingAdapter {
    @JvmStatic
    @BindingAdapter("loadBmp")
    fun loadBmp(view: ImageView, bitmap: Bitmap?) {
        if (bitmap != null){
            view.setImageBitmap(bitmap)
        }
    }
}