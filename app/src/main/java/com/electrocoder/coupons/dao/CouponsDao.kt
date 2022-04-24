package com.electrocoder.coupons.dao

import androidx.room.Dao
import androidx.room.Query
import com.electrocoder.coupons.entities.Coupon
import kotlinx.coroutines.flow.Flow

@Dao
interface CouponsDao {

    @Query("SELECT * FROM coupons")
    fun getAllCoupons(): Flow<List<Coupon>>

}