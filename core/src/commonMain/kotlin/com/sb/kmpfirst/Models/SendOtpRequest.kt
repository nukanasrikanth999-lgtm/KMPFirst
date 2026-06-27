package com.sb.kmpfirst.Models

import kotlinx.serialization.Serializable

@Serializable
data class SendOtpRequest(val mobileNumber:String)