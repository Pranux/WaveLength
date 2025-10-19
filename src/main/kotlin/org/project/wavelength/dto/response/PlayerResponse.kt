package org.project.wavelength.dto.response

import org.project.wavelength.model.Role
import org.project.wavelength.model.Team

data class PlayerResponse (
    val id: String,
    val name: String,
    val team: Team,
    val role: Role
)