package com.example.testtask.model

import com.example.testtask.R

object DataGenerator {

    fun generateProductList() = arrayListOf(
        ProductData(
            id = 1,
            titleProduct = "Керамогранит",
            price = "730,35 р/шт",
            imageProduct = R.drawable.knauf_rotband_30_kg_
        ),
        ProductData(
            id = 2,
            titleProduct = "Керамогранит",
            price = "730,35 р/шт",
            imageProduct = R.drawable.knauf_rotband_30_kg_
        ),
        ProductData(
            id = 3,
            titleProduct = "Керамогранит",
            price = "730,35 р/шт",
            imageProduct = R.drawable.knauf_rotband_30_kg_
        ),
        ProductData(
            id = 4,
            titleProduct = "Керамогранит",
            price = "730,35 р/шт",
            imageProduct = R.drawable.knauf_rotband_30_kg_
        ),
        ProductData(
            id = 5,
            titleProduct = "Керамогранит",
            price = "730,35 р/шт",
            imageProduct = R.drawable.knauf_rotband_30_kg_
        )
    )

    fun generateCatalogList() = arrayListOf(
        CatalogData(
            id = 1,
            titleCatalog = "Каталог",
            imageCatalog = R.drawable.check
        ),
        CatalogData(
            id = 2,
            titleCatalog = "Каталог",
            imageCatalog = R.drawable.check
        ),
        CatalogData(
            id = 3,
            titleCatalog = "Каталог",
            imageCatalog = R.drawable.check
        ),
        CatalogData(
            id = 4,
            titleCatalog = "Каталог",
            imageCatalog = R.drawable.check
        ),
        CatalogData(
            id = 5,
            titleCatalog = "Каталог",
            imageCatalog = R.drawable.check
        )
    )
}