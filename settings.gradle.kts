pluginManagement {
  repositories {
    gradlePluginPortal()
    maven("https://papermc.io/repo/repository/maven-public/")
  }
}

rootProject.name = "Byof"

include("Byof-API", "Byof-Server")
