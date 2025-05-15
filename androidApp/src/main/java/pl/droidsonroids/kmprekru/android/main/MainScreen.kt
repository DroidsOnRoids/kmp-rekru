package pl.droidsonroids.kmprekru.android.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import pl.droidsonroids.kmprekru.android.MyApplicationTheme
import pl.droidsonroids.kmprekru.main.MainViewModel

@Composable
internal fun MainScreen(
    viewModel: MainViewModel = viewModel { MainViewModel.getInstance() }
) {
    val greeting by viewModel.greeting.collectAsStateWithLifecycle()

    MainScreen(greeting = greeting)
}

@Composable
internal fun MainScreen(greeting: String) {
    Scaffold { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentAlignment = Alignment.Center
        ) {
            Text(text = greeting)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MainScreenPreview() {
    MyApplicationTheme {
        MainScreen("Hello, Android!")
    }
}
