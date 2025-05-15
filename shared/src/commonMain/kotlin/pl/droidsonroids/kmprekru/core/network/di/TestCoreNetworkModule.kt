package pl.droidsonroids.kmprekru.core.network.di

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.MockEngineConfig
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module
import pl.droidsonroids.kmprekru.core.network.getHttpClient

internal val testCoreNetworkModule = module {

    single { MockEngineConfig() }

    singleOf(::MockEngine) bind HttpClientEngine::class

    singleOf(::getHttpClient)
}
