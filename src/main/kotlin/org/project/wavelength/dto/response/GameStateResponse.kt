package org.project.wavelength.dto.response

import org.project.wavelength.model.GamePhase
import org.project.wavelength.model.Team

data class GameStateResponse (
    val roomId: String,
    val phase: GamePhase,
    val players: List<PlayerResponse>,
    val currentRound: RoundResponse?,
    val scores: Map<Team, Int>
)