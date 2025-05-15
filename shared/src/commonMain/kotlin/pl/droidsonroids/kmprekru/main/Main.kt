package pl.droidsonroids.kmprekru.main

import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import pl.droidsonroids.kmprekru.core.network.di.coreNetworkModule
import pl.droidsonroids.kmprekru.core.platform.di.corePlatformModule

internal fun initSharedModule(nativeSetup: KoinApplication.() -> Unit) {
    startKoin {
        modules(mainModule, coreNetworkModule, corePlatformModule)
        nativeSetup()
    }
}
