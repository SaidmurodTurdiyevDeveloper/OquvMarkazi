package uz.smt.oquvmarkazi.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import timber.log.Timber.Forest.plant


/**
 *  This file is created by Saidmurod Turdiyev SMT for O`quv Markazi app
 *  5/28/2023  9:42 PM  Asus Rog
 */
@HiltAndroidApp
class App :Application(){
    override fun onCreate() {
        super.onCreate()
        plant(Timber.DebugTree())
    }
}