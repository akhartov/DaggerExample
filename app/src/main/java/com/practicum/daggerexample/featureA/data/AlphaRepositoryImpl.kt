package com.practicum.daggerexample.featureA.data

import com.practicum.daggerexample.featureA.domain.AlphaRepository
import javax.inject.Inject

class AlphaRepositoryImpl @Inject constructor(): AlphaRepository {
    override fun consume(consumer: AlphaRepository.Consumer) {
        consumer.consume(AlphaRepository.Aplha("This is Alpha"))
    }
}