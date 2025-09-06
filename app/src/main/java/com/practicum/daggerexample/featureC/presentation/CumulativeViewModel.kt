package com.practicum.daggerexample.featureC.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.practicum.daggerexample.featureC.domain.CumulativeRepository
import javax.inject.Inject

class CumulativeViewModel @Inject constructor(private val cumulativeRepository: CumulativeRepository): ViewModel() {
    private val _liveData = MutableLiveData<String>()
    fun getLiveData(): LiveData<String> = _liveData

    fun doSomethingLikeComp() {
        cumulativeRepository.consume {
            _liveData.postValue("From CumulativeViewModel: ${it.items}")
        }
    }
}