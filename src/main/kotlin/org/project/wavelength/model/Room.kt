package org.project.wavelength.model

import java.util.UUID

data class Room (
    val id: String = UUID.randomUUID().toString(),
    val players: MutableList<Player> = mutableListOf(),
    val maxPlayers: Int = 8,
    var currentRound: Round? = null,
    val scores: MutableMap<Team, Int> = mutableMapOf(
        Team.TEAM_A to 0,
        Team.TEAM_B to 0,
    ),
    var state: GamePhase = GamePhase.LOBBY,
    val usedSpectrum: MutableSet<Spectrum> = mutableSetOf(),
)