package org.project.wavelength.dto.request

data class SubmitClueRequest (
    val roomId: String,
    val playerId: String,
    val clueId: String
)