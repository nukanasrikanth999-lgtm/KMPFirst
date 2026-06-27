package com.sb.kmpfirst.Models

import kotlinx.serialization.Serializable

@Serializable
data class UserDto(  val id: Int,
                     val name: String,
                     val mobileNumber: String,
                     val address: String,
                     val photoUrl: String? = null)