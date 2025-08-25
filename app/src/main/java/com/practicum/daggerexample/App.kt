package com.practicum.daggerexample

import android.app.Application
import com.practicum.daggerexample.di.AppComponent
import com.practicum.daggerexample.di.ContextModule
import com.practicum.daggerexample.di.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .contextModule(ContextModule(this)) // Передаем экземпляр Application
            .build()
    }

}