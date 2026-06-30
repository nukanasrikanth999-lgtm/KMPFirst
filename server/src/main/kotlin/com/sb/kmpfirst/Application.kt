package com.sb.kmpfirst

import com.sb.kmpfirst.Models.AuthResponse
import com.sb.kmpfirst.Models.SendOtpRequest
import com.sb.kmpfirst.Models.UserDto
import com.sun.tools.jdeprscan.Main.call

import io.ktor.serialization.kotlinx.json.json
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation
import io.ktor.server.request.receive
import io.ktor.server.routing.*
import java.nio.file.Paths.get
import io.ktor.server.request.*
import io.ktor.server.response.respond
import jdk.internal.vm.ScopedValueContainer.call

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    install(ContentNegotiation) {
        json()
    }
    val users = mutableListOf(UserDto(1,"Srikanth","9866220553","4-134,bhattuvaripalli,karempudi,guntur",null),
    UserDto(1,"Srikanth","9866220553","4-134,bhattuvaripalli,karempudi,guntur",null),
   UserDto(1,"Srikanth","9866220553","4-134,bhattuvaripalli,karempudi,guntur",null),
    UserDto(1,"Srikanth","9866220553","4-134,bhattuvaripalli,karempudi,guntur",null),
    UserDto(1,"Srikanth","9866220553","4-134,bhattuvaripalli,karempudi,guntur",null),
    UserDto(1,"Srikanth","9866220553","4-134,bhattuvaripalli,karempudi,guntur",null),
    UserDto(1,"Srikanth","9866220553","4-134,bhattuvaripalli,karempudi,guntur",null),
    UserDto(1,"Srikanth","9866220553","4-134,bhattuvaripalli,karempudi,guntur",null),
    UserDto(1,"Srikanth","9866220553","4-134,bhattuvaripalli,karempudi,guntur",null),)

    routing {
        get("/auth/send-otp") {

            val request = call.receive<SendOtpRequest>()
            call.respond(
                AuthResponse(
                    success = true,
                    message = "OTP sent to ${request.mobileNumber}.use 123456 for Testing "
                ))
        }



    }
}