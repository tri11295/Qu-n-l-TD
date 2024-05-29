package com.example.qunltd.model

data class Receipt(
    val customer: Customer,
    val listProduct : List<ProductModel>
)