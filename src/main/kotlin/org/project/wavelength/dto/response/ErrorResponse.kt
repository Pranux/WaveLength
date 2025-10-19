package org.project.wavelength.dto.response

data class ErrorResponse (
    val error: String,
    val message: String,
    val timestamp: Long = System.currentTimeMillis()
)