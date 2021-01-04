package com.sicredi.sicreditestapp.ui.extension

import android.widget.ImageView
import androidx.annotation.DrawableRes
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.sicredi.sicreditestapp.R

fun ImageView.loadImage(
    imageUrl: String?) {
    val requestOptions = RequestOptions().apply {
    }
    Glide.with(this.context)
        .setDefaultRequestOptions(requestOptions)
        .load(imageUrl)
        .into(this)
}