package com.ycomapny.yecom.login

import android.util.Log
import com.ycomapny.base.BaseViewModel
import com.ycomapny.repository.LocalDataRepository

class SignUpViewModel: BaseViewModel() {
    private val localRepository = LocalDataRepository()

    fun logRepository(){
        Log.e("TAG", "Local Data Repo >> $localRepository")
    }




}