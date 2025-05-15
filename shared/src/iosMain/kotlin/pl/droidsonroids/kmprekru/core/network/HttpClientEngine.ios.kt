package pl.droidsonroids.kmprekru.core.network

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.darwin.Darwin

internal actual fun getHttpClientEngine(): HttpClientEngine = Darwin.create()
