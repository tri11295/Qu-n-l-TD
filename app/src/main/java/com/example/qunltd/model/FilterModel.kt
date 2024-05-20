package com.example.qunltd.model

data class FilterModel(
    val id: String,
    val text: String,
    val status: String,
    val isSelected: Boolean = false
)