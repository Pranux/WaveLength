package org.project.wavelength.dto.response

import org.project.wavelength.model.GamePhase
import org.project.wavelength.model.Player

data class RoomResponse (
    val id: String,
    val players: List<Player>,
    val state: GamePhase
)