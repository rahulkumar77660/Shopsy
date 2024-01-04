package com.example.shopsy.model

import com.example.shopsy.model.Notes

data class OrderApiReq(
    val amount: Int,
    val currency: String,
    val notes: Notes,
    val receipt: String
)
