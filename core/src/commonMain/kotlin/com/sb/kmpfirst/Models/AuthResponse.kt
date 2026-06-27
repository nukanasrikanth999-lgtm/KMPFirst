package com.sb.kmpfirst.Models

import kotlinx.serialization.Serializable

@Serializable
data class AuthResponse(val success: Boolean,val token:String?=null,val message:String)
