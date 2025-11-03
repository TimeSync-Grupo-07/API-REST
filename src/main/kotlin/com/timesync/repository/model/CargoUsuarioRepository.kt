package com.timesync.repository.model

import com.timesync.model.CargoUsuario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface CargoUsuarioRepository: JpaRepository<CargoUsuario, UUID> {
}