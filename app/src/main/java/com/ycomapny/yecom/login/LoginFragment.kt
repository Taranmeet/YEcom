package com.ycomapny.yecom.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.ycomapny.base.BaseFragment
import com.ycomapny.yecom.R
import com.ycomapny.yecom.dashboard.DashboardActivity
import com.ycomapny.yecom.databinding.FragmentLoginBinding

class LoginFragment private constructor(): BaseFragment<LoginViewModel, FragmentLoginBinding>() {
    override fun getViewModelClass() = LoginViewModel::class.java

    override fun getLayout() = R.layout.fragment_login

    companion object{
        fun newInstance(): LoginFragment{
            val bundle = Bundle()
            return LoginFragment().apply {
                arguments = bundle
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataBinding.viewModel = viewModel
        observeLiveData()
    }

    private fun observeLiveData() {
        viewModel.navigateToDashboard.observe(viewLifecycleOwner) {
            startActivity(Intent(context, DashboardActivity::class.java))
            activity?.finish()
        }
    }

}