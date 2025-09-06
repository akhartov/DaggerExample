package com.practicum.daggerexample.featureC.domain

interface CumulativeRepository {
    //fun getFromRepo(): List<String>

    fun consume(consumer: Consumer)

    fun interface Consumer {
        fun consume(cumulative: Cumulative)
    }

    data class Cumulative(val items: List<String>)
}