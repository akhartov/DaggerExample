package com.practicum.daggerexample.featureA.domain

interface AlphaRepository {
    fun consume(consumer: Consumer)

    fun interface Consumer {
        fun consume(aplha: Aplha)
    }

    data class Aplha(val text: String)
}