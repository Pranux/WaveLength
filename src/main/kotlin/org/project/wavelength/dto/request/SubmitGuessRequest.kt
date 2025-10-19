package org.project.wavelength.dto.request

data class SubmitGuessRequest (
    val roomId: String,
    val playerId: String,
    val guessAngle: Int
)