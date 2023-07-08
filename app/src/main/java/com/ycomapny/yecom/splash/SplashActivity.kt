package com.ycomapny.yecom.splash

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import com.ycomapny.base.BaseActivity
import com.ycomapny.yecom.R

@SuppressLint("CustomSplashScreen")
class SplashActivity : BaseActivity<SplashViewModel>() {
    override fun getViewModelClass() = SplashViewModel::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

}