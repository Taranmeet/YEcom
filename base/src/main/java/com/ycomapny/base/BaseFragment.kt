package com.ycomapny.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

abstract class BaseFragment<VM : BaseViewModel, DB: ViewDataBinding>: Fragment() {

    /**
     * This method must be inherited by child classes to provide us with the class info for there
     * respective view models
     */
    abstract fun getViewModelClass(): Class<VM>

    /**
     * This method must be inherited by child classes to provide us with the layout that needs to be
     * used to instantiate dataBinding object and hence draw layout
     */
    abstract fun getLayout(): Int

    protected lateinit var viewModel: VM

    protected lateinit var dataBinding : DB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[getViewModelClass()]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = DataBindingUtil.inflate(inflater, getLayout(), container, false)
        super.onCreateView(inflater, container, savedInstanceState)
        return dataBinding.root
    }
}