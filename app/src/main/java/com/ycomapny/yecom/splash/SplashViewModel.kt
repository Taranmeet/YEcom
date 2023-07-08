package com.ycomapny.yecom.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ycomapny.base.BaseViewModel
import com.ycomapny.yecom.utils.SingleLiveEvent
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * @description - View Model class for splash screen.
 * @author Taranmeet Singh
 * @email - taranmeet.mehta@nagarro.com
 */
class SplashViewModel: BaseViewModel() {

    private val _launchNextScreen = SingleLiveEvent<Void>()
    val launchNextScreen : LiveData<Void> = _launchNextScreen

    public fun waitBeforeNavigating(){
        viewModelScope.launch {
            delay(1500)
            _launchNextScreen.call()
        }
    }

}