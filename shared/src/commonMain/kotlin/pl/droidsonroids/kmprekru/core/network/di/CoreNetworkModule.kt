package pl.droidsonroids.kmprekru.core.network.di

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import pl.droidsonroids.kmprekru.core.network.getHttpClient
import pl.droidsonroids.kmprekru.core.network.getHttpClientEngine

internal val coreNetworkModule = module {

    singleOf(::getHttpClientEngine)

    singleOf(::getHttpClient)
}
