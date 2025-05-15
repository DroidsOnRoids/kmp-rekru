package pl.droidsonroids.kmprekru.core.platform.di

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module
import pl.droidsonroids.kmprekru.core.platform.FakePlatform
import pl.droidsonroids.kmprekru.core.platform.Platform

internal val testCorePlatformModule = module {

    singleOf(::FakePlatform) bind Platform::class
}
