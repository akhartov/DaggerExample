package com.practicum.daggerexample.featureB.domain

interface BravoRepository {

    fun consume(consumer: Consumer)

    fun interface Consumer {
        fun consume(aplha: Bravo)
    }

    data class Bravo(val text: String)
}