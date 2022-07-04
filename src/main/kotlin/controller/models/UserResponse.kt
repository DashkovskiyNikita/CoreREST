package controller.models

import kotlinx.serialization.Serializable

@Serializable
data class UserResponse(
    val name: String,
    val surname: String
)
