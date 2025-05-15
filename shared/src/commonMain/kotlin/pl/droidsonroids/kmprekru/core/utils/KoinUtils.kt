package pl.droidsonroids.kmprekru.core.utils

import org.koin.core.parameter.ParametersDefinition
import org.koin.mp.KoinPlatformTools

internal inline fun <reified T> getFromKoin(noinline parameters: ParametersDefinition? = null): T =
    KoinPlatformTools.defaultContext().get().get(parameters = parameters)