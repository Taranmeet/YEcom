package com.ycomapny.yecom.dashboard

import android.os.Bundle
import com.ycomapny.base.BaseActivity
import com.ycomapny.yecom.R
import com.ycomapny.yecom.databinding.ActivityDashboardBinding

class DashboardActivity: BaseActivity<DashboardViewModel, ActivityDashboardBinding>() {
    override fun getViewModelClass() = DashboardViewModel::class.java

    override fun getLayout() = R.layout.activity_dashboard

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        replaceFragment(R.id.fl_frame, DashboardFragment.newInstance())
    }
}