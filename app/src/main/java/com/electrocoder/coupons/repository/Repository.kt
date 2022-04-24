package com.electrocoder.coupons.repository

import com.electrocoder.coupons.dao.CouponsDao


class Repository(private val dao: CouponsDao) {

    val coupons = dao.getAllCoupons()

}