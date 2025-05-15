package pl.droidsonroids.kmprekru.core.network

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.okhttp.OkHttp

internal actual fun getHttpClientEngine(): HttpClientEngine = OkHttp.create()