package com.ycomapny.yecom.login

import android.os.Bundle

import com.ycomapny.base.BaseActivity
import com.ycomapny.yecom.R
import com.ycomapny.yecom.databinding.ActivityOnboardingBinding

/**
 * @description - Activity to be used for user login and signup
 * @author Taranmeet Singh
 * @email - taranmeet.mehta@nagarro.com
 */
class OnboardingActivity : BaseActivity<LoginViewModel, ActivityOnboardingBinding>() {

    override fun getViewModelClass() = LoginViewModel::class.java

    override fun getLayout(): Int = R.layout.activity_onboarding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}