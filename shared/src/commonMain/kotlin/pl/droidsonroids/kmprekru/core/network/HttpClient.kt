package pl.droidsonroids.kmprekru.core.network

import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

internal fun getHttpClient(engine: HttpClientEngine) = HttpClient(engine) {
    expectSuccess = true
    defaultRequest {
        url("https://jsonplaceholder.typicode.com")
        contentType(ContentType.Application.Json)
    }
    install(ContentNegotiation) {
        json(
            Json {
                prettyPrint = true
                ignoreUnknownKeys = true
                explicitNulls = false
            }
        )
    }
}