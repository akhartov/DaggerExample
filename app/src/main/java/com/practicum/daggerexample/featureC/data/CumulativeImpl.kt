package com.practicum.daggerexample.featureC.data

import com.practicum.daggerexample.featureA.domain.AlphaRepository
import com.practicum.daggerexample.featureB.domain.BravoRepository
import com.practicum.daggerexample.featureC.domain.CumulativeRepository
import javax.inject.Inject

class CumulativeImpl @Inject constructor(
    private val alphaRepository: AlphaRepository,
    private val bravoRepository: BravoRepository
): CumulativeRepository {
    /*override fun getFromRepo(): List<String> {
        val items = mutableListOf<String>()
        alphaRepository.consume {
            items.add(it.text)
        }

        bravoRepository.consume {
            items.add(it.text)
        }

        return items
    }*/

    override fun consume(consumer: CumulativeRepository.Consumer) {

        val items = mutableListOf<String>()

        alphaRepository.consume {
            items.add(it.text)
        }

        bravoRepository.consume {
            items.add(it.text)
        }

        consumer.consume(CumulativeRepository.Cumulative(items))
    }
}