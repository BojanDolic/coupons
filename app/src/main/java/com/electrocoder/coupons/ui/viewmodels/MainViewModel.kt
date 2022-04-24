package com.electrocoder.coupons.ui.viewmodels

import android.app.Application
import androidx.lifecycle.*
import com.electrocoder.coupons.database.CouponDatabase
import com.electrocoder.coupons.entities.Coupon
import com.electrocoder.coupons.repository.Repository

class MainViewModel(app: Application) : AndroidViewModel(app) {

    private var repository: Repository

    private var coupons: LiveData<List<Coupon>>

    init {
        val dao = CouponDatabase.getDatabase(app.applicationContext).dao()
        repository = Repository(dao)
        coupons = repository.coupons.asLiveData(viewModelScope.coroutineContext)
    }

}