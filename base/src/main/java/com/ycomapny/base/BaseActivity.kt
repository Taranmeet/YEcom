package com.ycomapny.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

/**
 * @description - Base class for activity. This will contain common code for all activities.
 * @author Taranmeet Singh
 * @email - taranmeet.mehta@nagarro.com
 */
abstract class BaseActivity<VM : BaseViewModel>: AppCompatActivity(){

    /**
     * This method must be inherited by child classes to provide us with the class info for there
     * respective view models
     */
    abstract fun getViewModelClass(): Class<VM>

    protected lateinit var viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BaseViewModel::class.java
        viewModel = ViewModelProvider(this)[getViewModelClass()]
    }
}