package com.practicum.daggerexample.featureA.di

import com.practicum.daggerexample.featureA.data.AlphaRepositoryImpl
import com.practicum.daggerexample.featureA.domain.AlphaRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class AlphaModule {
    @Binds
    @Singleton
    abstract fun provideRepository(dataManager: AlphaRepositoryImpl): AlphaRepository
}