package com.ycomapny.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.databinding.ViewDataBinding
/**
 * @description - Base class for activity. This will contain common code for all activities.
 * @author Taranmeet Singh
 * @email - taranmeet.mehta@nagarro.com
 */
abstract class BaseActivity<VM : BaseViewModel, DB: ViewDataBinding>: AppCompatActivity(){

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
        BaseViewModel::class.java
        viewModel = ViewModelProvider(this)[getViewModelClass()]
        dataBinding = DataBindingUtil.setContentView(this, getLayout())
    }
}