package com.practicum.daggerexample.di

import com.practicum.daggerexample.MainActivity
import com.practicum.daggerexample.featureA.di.AlphaModule
import com.practicum.daggerexample.featureA.presentation.AlphaViewModel
import com.practicum.daggerexample.featureB.di.BravoModule
import com.practicum.daggerexample.featureB.presentation.BravoViewModel
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        AlphaModule::class,
    BravoModule::class,
    ContextModule::class
    ]
)
@Singleton
interface AppComponent {
    @Component.Builder
    interface Builder {
        fun contextModule(module: ContextModule): Builder
        fun build(): AppComponent
    }

    fun inject(activity: MainActivity)

    fun provideAplhaViewModel(): AlphaViewModel
    fun provideBravoViewModel(): BravoViewModel
}