package com.example.app_kotlin_wheather

import android.app.Application
import com.example.app_kotlin_wheather.data.Database

class App : Application() {

    companion object {
        lateinit var instance: App
        val database: Database by lazy {
            Database(instance)
        }
    }
    override fun onCreate() {
        super.onCreate()
        instance=this
    }
}