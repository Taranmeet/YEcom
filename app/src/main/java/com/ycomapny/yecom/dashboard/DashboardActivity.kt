package com.ycomapny.yecom.dashboard

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import com.ycomapny.base.BaseActivity
import com.ycomapny.yecom.R
import com.ycomapny.yecom.databinding.ActivityDashboardBinding


class DashboardActivity: BaseActivity<DashboardViewModel, ActivityDashboardBinding>() {
    override fun getViewModelClass() = DashboardViewModel::class.java

    override fun getLayout() = R.layout.activity_dashboard

    private lateinit var actionBarToggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        replaceFragment(R.id.fl_frame, DashboardFragment.newInstance())
        setupAndNavigationBar()
    }

    private fun setupAndNavigationBar(){
        actionBarToggle =  ActionBarDrawerToggle(this, dataBinding.drawerLayout,
            R.string.nav_open, R.string.nav_close)

        dataBinding.drawerLayout.addDrawerListener(actionBarToggle)

        actionBarToggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        dataBinding.navigationView.setNavigationItemSelectedListener { _ ->
            dataBinding.drawerLayout.close()
            false
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (actionBarToggle.onOptionsItemSelected(item)) {
            true
        } else super.onOptionsItemSelected(item)
    }


}