package org.project.wavelength.model

import java.util.UUID

enum class Team {
    TEAM_A,
    TEAM_B,
}

enum class Role {
    GUESSER,
    CLUE_GIVER
}

data class Player (
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val team: Team,
    var role: Role? = null,
)