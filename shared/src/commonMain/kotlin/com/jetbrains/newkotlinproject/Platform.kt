package com.jetbrains.newkotlinproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform