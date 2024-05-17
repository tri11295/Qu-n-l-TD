package com.example.qunltd.ui.home

data class SellModel(
    val date: String,
    val listReceipt: List<Receipt>
)

data class Receipt(
    val nameCustomer: String,
    val sumMoney: Int
)