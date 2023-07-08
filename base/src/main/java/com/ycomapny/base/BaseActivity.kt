package com.ycomapny.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider


abstract class BaseActivity<VM : BaseViewModel>: AppCompatActivity(){

    abstract fun getViewModelClass(): Class<VM>

    protected lateinit var viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BaseViewModel::class.java
        viewModel = ViewModelProvider(this)[getViewModelClass()]
    }
}