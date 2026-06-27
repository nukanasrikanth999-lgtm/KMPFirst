package com.sb.kmpfirst

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform