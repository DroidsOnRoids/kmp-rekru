package pl.droidsonroids.kmprekru

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform