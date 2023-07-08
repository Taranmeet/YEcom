package com.ycomapny.yecom.login

import android.os.Bundle
import com.ycomapny.base.BaseActivity
import com.ycomapny.yecom.R

class LoginActivity : BaseActivity<LoginViewModel>() {
    override fun getViewModelClass() = LoginViewModel::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}