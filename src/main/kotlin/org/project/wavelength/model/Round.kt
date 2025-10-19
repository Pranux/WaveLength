package org.project.wavelength.model

data class Round (
    val spectrum: Spectrum,
    val target: Int,
    val clueGiverId: String,
    var clue: String? = null,
    var guess: Int? = null,
    val activeTeam: Team,
)