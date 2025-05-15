package pl.droidsonroids.kmprekru.android

import android.app.Application
import pl.droidsonroids.kmprekru.main.initSharedModule

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initSharedModule(applicationContext)
    }
}
