package pl.droidsonroids.kmprekru.core.platform.di

import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module
import pl.droidsonroids.kmprekru.core.platform.getPlatform

internal val corePlatformModule = module {

    factoryOf(::getPlatform)
}
