package pl.droidsonroids.kmprekru.main

import app.cash.turbine.test
import io.kotest.matchers.shouldBe
import kotlinx.coroutines.test.runTest
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.test.KoinTest
import org.koin.test.inject
import pl.droidsonroids.kmprekru.core.platform.di.testCorePlatformModule
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test

class MainViewModelTest : KoinTest {

    private val viewModel: MainViewModel by inject()

    @BeforeTest
    fun setup() {
        startKoin { modules(mainModule, testCorePlatformModule) }
    }

    @AfterTest
    fun tearDown() {
        stopKoin()
    }

    @Test
    fun `emits greeting with platform name`() = runTest {
        viewModel.greeting.test {
            awaitItem() shouldBe "Hello, Fake Platform!"
        }
    }
}
