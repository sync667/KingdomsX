plugins {
    java
    kotlin
    commons
    spigot
}

group = "org.kingdoms.platform.bukkit"
version = "unspecified"

dependencies {
    compileOnly(project(":shared"))
}