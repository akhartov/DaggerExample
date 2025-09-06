package com.practicum.daggerexample.featureB.di

import com.practicum.daggerexample.featureB.data.BravoRepositoryImpl
import com.practicum.daggerexample.featureB.domain.BravoRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class BravoModule {
    @Binds
    @Singleton
    abstract fun provideRepository(dataManager: BravoRepositoryImpl): BravoRepository
}