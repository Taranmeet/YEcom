package com.ycomapny.yecom.splash

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import com.ycomapny.base.BaseActivity
import com.ycomapny.yecom.R
import com.ycomapny.yecom.databinding.ActivitySplashBinding
import com.ycomapny.yecom.login.OnboardingActivity

/**
 * @description - Splash Activity for showing splash screen. Here we can load configurations in
 * future versions.
 * @author Taranmeet Singh
 * @email - taranmeet.mehta@nagarro.com
 */
@SuppressLint("CustomSplashScreen")
class SplashActivity : BaseActivity<SplashViewModel, ActivitySplashBinding>() {

    override fun getViewModelClass() = SplashViewModel::class.java

    override fun getLayout(): Int = R.layout.activity_splash

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        observeLiveData()
        viewModel.waitBeforeNavigating()
    }

    private fun observeLiveData() {
        viewModel.launchNextScreen.observe(this) {
            startActivity(Intent(this, OnboardingActivity::class.java))
            finish()
        }
    }

}