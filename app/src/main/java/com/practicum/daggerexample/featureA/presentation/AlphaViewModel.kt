package com.practicum.daggerexample.featureA.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.practicum.daggerexample.featureA.domain.AlphaRepository
import javax.inject.Inject

class AlphaViewModel @Inject constructor(val alphaRepository: AlphaRepository): ViewModel() {
    private val _liveData = MutableLiveData<String>()
    fun getLiveData(): LiveData<String> = _liveData

    fun doSomething() {
        alphaRepository.consume {
            _liveData.postValue("From AlphaViewModel: ${it.text}")
        }
    }
}