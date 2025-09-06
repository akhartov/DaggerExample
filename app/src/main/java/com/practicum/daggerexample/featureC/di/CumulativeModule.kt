package com.practicum.daggerexample.featureC.di

import com.practicum.daggerexample.featureA.domain.AlphaRepository
import com.practicum.daggerexample.featureB.domain.BravoRepository
import com.practicum.daggerexample.featureC.data.CumulativeImpl
import com.practicum.daggerexample.featureC.domain.CumulativeRepository
import dagger.Module
import dagger.Provides

@Module
class CumulativeModule {
    @Provides
    fun provideRepositoryC(alphaRepository: AlphaRepository, bravoRepository: BravoRepository): CumulativeRepository {
        return CumulativeImpl(alphaRepository, bravoRepository)
    }
}