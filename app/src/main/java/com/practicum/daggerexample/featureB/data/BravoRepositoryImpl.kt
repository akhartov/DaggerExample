package com.practicum.daggerexample.featureB.data

import com.practicum.daggerexample.featureB.domain.BravoRepository
import javax.inject.Inject

class BravoRepositoryImpl @Inject constructor(): BravoRepository {
    override fun consume(consumer: BravoRepository.Consumer) {
        consumer.consume(BravoRepository.Bravo("This is Bravo"))
    }
}
