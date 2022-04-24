package com.electrocoder.coupons.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "coupons")
data class Coupon(
    @PrimaryKey val id: Int?,
    val price: String,
    val date: Date,
)
