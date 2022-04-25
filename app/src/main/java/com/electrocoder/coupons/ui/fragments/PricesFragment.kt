package com.electrocoder.coupons.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.electrocoder.coupons.R
import com.electrocoder.coupons.ui.viewmodels.PricesViewModel

class PricesFragment : Fragment() {

    companion object {
        fun newInstance() = PricesFragment()
    }

    private lateinit var viewModel: PricesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.prices_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PricesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}