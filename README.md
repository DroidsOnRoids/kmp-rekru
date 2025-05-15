# KMP Rekru

Przykładowa aplikacja KMP do Pair Programmingu na rozmowy rekrutacyjne

### Struktura projektu
- `androidApp` - natywna aplikacja Android
- `iosApp` - natywna aplikacja iOS
- `shared` - wspólny moduł KMP

### Podłączone biblioteki
- [Jetpack Compose](https://developer.android.com/compose)
- [AndroidX ViewMdoel](https://developer.android.com/topic/libraries/architecture/viewmodel)
- [SKIE](https://skie.touchlab.co/)
- [Koin](https://insert-koin.io/)
- [Ktor](https://ktor.io/)
- [Kotlin Coroutines](https://github.com/Kotlin/kotlinx.coroutines)
- [Kotlin Serialization](https://github.com/Kotlin/kotlinx.serialization)
- [Kotlin DateTime](https://github.com/Kotlin/kotlinx-datetime)
- [Kotlin Test](https://kotlinlang.org/api/core/kotlin-test/)
- [Turbine](https://github.com/cashapp/turbine)
- [Kotest Assertions](https://kotest.io/docs/assertions/assertions.html)

## Zadanie na Pair Programming

Zaimplementuj prostą aplikację Todo korzystając z danych dostępnych w API JSONPlaceholder

https://jsonplaceholder.typicode.com/

### Podstawowy zakres
1. Warstwa danych do pobierania listy Todo z API
2. ViewModel do zarządzania stanem ekranu listy Todo
3. Przewijany ekran listy Todo
4. Testy jednostkowe do wybranego kodu

### Opcjonalny zakres
1. Cachowanie pobranych Todo
2. Ekran listy Todo na drugiej platformie
2. Obsługa zmiany stanu Todo completed / not completed
3. Wyszukiwanie Todo po nazwie