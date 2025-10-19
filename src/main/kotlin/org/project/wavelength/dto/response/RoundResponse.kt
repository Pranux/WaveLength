package org.project.wavelength.dto.response

import org.project.wavelength.model.Spectrum
import org.project.wavelength.model.Team

data class RoundResponse (
    val spectrum: Spectrum,
    val angle: Int?,
    val clue: String?,
    val guessAngle: Int?,
    val currentTeam: Team
)