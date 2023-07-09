package com.ycomapny.yecom.login

import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener

import com.ycomapny.base.BaseActivity
import com.ycomapny.yecom.R
import com.ycomapny.yecom.databinding.ActivityOnboardingBinding

/**
 * @description - Activity to be used for user login and signup
 * @author Taranmeet Singh
 * @email - taranmeet.mehta@nagarro.com
 */
class OnboardingActivity : BaseActivity<OnboardingViewModel, ActivityOnboardingBinding>() {

    override fun getViewModelClass() = OnboardingViewModel::class.java

    override fun getLayout(): Int = R.layout.activity_onboarding

    private val loginFragment by lazy { LoginFragment.newInstance() }

    private val signUpFragment by lazy { SignUpFragment.newInstance() }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        replaceFragment(R.id.fl_frame, loginFragment)
        dataBinding.tlTabs.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> replaceFragment(R.id.fl_frame, loginFragment)

                    1 -> replaceFragment(R.id.fl_frame, signUpFragment)
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                // not needed
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                // not needed
            }
        })
    }
}