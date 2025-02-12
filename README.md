This is a Kotlin Multiplatform project targeting Android, iOS, Web, Desktop.

* `/shared` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains an iOS application. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

* `/androidApp` contains an Android application, which you can install with `gradlew :androidApp:installDebug` to a device connected over adb.

* `/desktopApp` contains a JVM desktop application, which you can run with the `./gradlew :desktopApp:desktopRun` task.

* `/wasmApp` contains a web application, which you can run with the `./gradlew :wasmApp:wasmJsBrowserDevelopmentRun` task.

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html),
[Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform/#compose-multiplatform),
[Kotlin/Wasm](https://kotl.in/wasm/)…
