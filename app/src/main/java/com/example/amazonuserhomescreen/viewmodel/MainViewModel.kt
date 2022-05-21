package com.example.amazonuserhomescreen.viewmodel

import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.amazonuserhomescreen.data.MainRepository
import com.example.amazonuserhomescreen.datamodel.DatamodelUser
import kotlinx.coroutines.launch
import java.lang.Exception

class MainViewModel: ViewModel() {

    private val repository = MainRepository()

    private val _userDetails = MutableLiveData<DatamodelUser>()
    val userDetails: LiveData<DatamodelUser> = _userDetails

    init {
        getUserDetails()
    }

    private fun getUserDetails() {
            viewModelScope.launch{
                try {
                    val data = repository.getUserDetails()
                    _userDetails.postValue(data?.copy())
                } catch (e:Exception) {
                    _userDetails.postValue(DatamodelUser(listOf()))

                }

            }


    }




}