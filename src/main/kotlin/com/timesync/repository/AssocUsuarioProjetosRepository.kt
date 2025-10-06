package com.timesync.repository

import com.timesync.model.AssocUsuarioProjetos
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface AssocUsuarioProjetosRepository : JpaRepository<AssocUsuarioProjetos, UUID> {
}