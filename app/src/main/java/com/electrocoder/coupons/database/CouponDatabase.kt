package com.electrocoder.coupons.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.electrocoder.coupons.dao.CouponsDao
import com.electrocoder.coupons.entities.Coupon

@Database(entities = [Coupon::class], version = 1)
abstract class CouponDatabase : RoomDatabase() {

    abstract fun dao(): CouponsDao

    companion object {

        @Volatile
        private var INSTANCE: CouponDatabase? = null

        fun getDatabase(context: Context): CouponDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CouponDatabase::class.java,
                    "coupon_database").build()

                INSTANCE = instance
                instance
            }
        }

    }

}