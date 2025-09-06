package com.practicum.daggerexample.featureB.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.practicum.daggerexample.featureB.domain.BravoRepository
import javax.inject.Inject

class BravoViewModel @Inject constructor(private val bravoRepository: BravoRepository): ViewModel() {
    private val _liveData = MutableLiveData<String>()
    fun getLiveData(): LiveData<String> = _liveData

    fun doSomethingLikeBravo() {
        bravoRepository.consume {
            _liveData.postValue("From BravoViewModel: ${it.text}")
        }
    }
}