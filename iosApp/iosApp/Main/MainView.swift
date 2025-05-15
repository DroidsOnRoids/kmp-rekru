import SwiftUI
import shared

struct MainView: View {
    let viewModel = MainViewModel.companion.getInstance()
    
    var body: some View {
        Observing(viewModel.greeting) { greeting in
            MainContentView(greeting: greeting)
        }
    }
}

private struct MainContentView: View {
    let greeting: String
    
    var body: some View {
        Text(greeting)
    }
}

struct MainContentViewPreview: PreviewProvider {
    static var previews: some View {
        MainContentView(greeting: "Hello, World!")
    }
}

