package pl.droidsonroids.kmprekru.main

import android.content.Context
import org.koin.android.ext.koin.androidContext

fun initSharedModule(context: Context) = initSharedModule {
    androidContext(context)
}
