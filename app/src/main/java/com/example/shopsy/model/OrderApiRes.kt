package com.example.shopsy.model

import com.example.shopsy.model.Notes

data class OrderApiRes(
    val amount: Int,
    val amount_due: Int,
    val amount_paid: Int,
    val attempts: Int,
    val created_at: Int,
    val currency: String,
    val entity: String,
    val id: String,
    val notes: Notes,
    val offer_id: Any,
    val receipt: String,
    val status: String
)

