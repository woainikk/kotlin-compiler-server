
val kotlinVersion: String by System.getProperties()
val indexes: String by System.getProperties()

plugins {
    kotlin("jvm")
    application
}

dependencies {
    implementation(project(":common", configuration = "default"))
    implementation("org.jetbrains.kotlin:idea:202-$kotlinVersion-IJ8194.7") {
        isTransitive = false
    }
}

application {
    mainClassName = "indexation.MainKt"
}

tasks.withType<JavaExec> {
    val rootName = project.rootProject.projectDir.toString()
    args = listOf("$rootName${File.separator}$kotlinVersion", "$rootName${File.separator}$indexes")
}
