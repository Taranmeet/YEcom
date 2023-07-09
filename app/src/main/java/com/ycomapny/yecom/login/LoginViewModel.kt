package com.ycomapny.yecom.login

import androidx.lifecycle.LiveData
import com.ycomapny.base.BaseViewModel
import com.ycomapny.yecom.utils.SingleLiveEvent

class LoginViewModel : BaseViewModel() {

    private val _navigateToDashboard = SingleLiveEvent<Void>()
    val navigateToDashboard: LiveData<Void> = _navigateToDashboard

    public fun onLoginClicked(){
        _navigateToDashboard.call()
    }

}