package com.ycomapny.yecom.login

import android.os.Bundle
import com.ycomapny.base.BaseFragment
import com.ycomapny.yecom.R
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

}