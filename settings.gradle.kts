pluginManagement {
  repositories {
    mavenLocal()
    gradlePluginPortal()
    maven("https://papermc.io/repo/repository/maven-public/")
  }
}

rootProject.name = "Nabulus"

include("Nabulus-API", "Nabulus-Server")
