package pl.droidsonroids.kmprekru.main

import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

internal val mainModule = module {

    factoryOf(::MainViewModel)
}
