package com.mefinst

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.mefinst.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureSecurity()
        configureSerialization()
        configureRouting()
    }.start(wait = true)
}
