package org.project.wavelength.dto.request

import org.project.wavelength.model.Team

data class JoinRoomRequest (
    val playerName: String,
    val team: Team
)