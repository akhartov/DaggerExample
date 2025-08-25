package com.practicum.daggerexample.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ContextModule(private val application: Application) {

    @Provides
    @Singleton
    //@ApplicationContext
    fun provideContext(): Context = application
}