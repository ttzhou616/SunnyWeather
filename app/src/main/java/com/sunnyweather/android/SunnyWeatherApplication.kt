package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import com.sunnyweather.android.constants.Constant

//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
class SunnyWeatherApplication :Application(){
    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        const val TOKEN = Constant.caiyunToken
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext

    }
}