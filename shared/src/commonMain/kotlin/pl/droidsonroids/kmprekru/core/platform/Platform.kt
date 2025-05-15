package pl.droidsonroids.kmprekru.core.platform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform