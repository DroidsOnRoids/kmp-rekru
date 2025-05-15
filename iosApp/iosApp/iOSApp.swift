import SwiftUI
import shared

@main
struct iOSApp: App {
    
    init() {
        doInitSharedModule()
    }
    
	var body: some Scene {
		WindowGroup {
            MainView()
		}
	}
}
