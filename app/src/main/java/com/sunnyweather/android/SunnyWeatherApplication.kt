package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication :Application(){
    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        const val TOKEN = "3WEb3PafnCfAaSEB"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}