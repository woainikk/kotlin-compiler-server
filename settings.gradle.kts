rootProject.name = "kotlin-compiler-server"
include(":executors")
include(":indexation")
include(":common")

pluginManagement {
  repositories {
    mavenCentral()
    gradlePluginPortal()
    maven("https://cache-redirector.jetbrains.com/kotlin.bintray.com/kotlin-plugin")
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-ide")
  }
}