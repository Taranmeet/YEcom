package com.ycomapny.yecom.dashboard

import android.os.Bundle
import com.ycomapny.base.BaseFragment
import com.ycomapny.yecom.R
import com.ycomapny.yecom.databinding.FragmentDashboardBinding

class DashboardFragment : BaseFragment<DashboardFragmentViewModel, FragmentDashboardBinding>() {
    override fun getViewModelClass() = DashboardFragmentViewModel::class.java

    override fun getLayout() = R.layout.fragment_dashboard

    companion object {
        fun newInstance(): DashboardFragment {
            val bundle = Bundle()
            return DashboardFragment().apply {
                arguments = bundle
            }
        }
    }

}