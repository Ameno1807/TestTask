package com.example.testtask.model

import androidx.annotation.DrawableRes

data class ProductData (
    val id: Int,
    val titleProduct: String,
    val price: String,
    @DrawableRes val imageProduct: Int
)