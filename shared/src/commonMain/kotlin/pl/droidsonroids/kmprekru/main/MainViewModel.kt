package pl.droidsonroids.kmprekru.main

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import pl.droidsonroids.kmprekru.core.platform.Platform
import pl.droidsonroids.kmprekru.core.utils.getFromKoin

class MainViewModel(platform: Platform) : ViewModel() {

    private val _greeting = MutableStateFlow("")
    val greeting = _greeting.asStateFlow()

    init {
        _greeting.value = "Hello, ${platform.name}!"
    }

    companion object {

        fun getInstance(): MainViewModel = getFromKoin()
    }
}
