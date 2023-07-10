package com.ycomapny.yecom.login

import android.os.Bundle
import android.view.View
import com.ycomapny.base.BaseFragment
import com.ycomapny.yecom.R
import com.ycomapny.yecom.databinding.FragmentSignUpBinding

class SignUpFragment private constructor(): BaseFragment<SignUpViewModel, FragmentSignUpBinding>() {
    override fun getViewModelClass() = SignUpViewModel::class.java

    override fun getLayout() = R.layout.fragment_sign_up

    companion object{
        fun newInstance() : SignUpFragment{
            val bundle = Bundle()
            return SignUpFragment().apply {
                arguments = bundle
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataBinding.viewModel = viewModel
    }


}