package com.timesync.repository.model

import com.timesync.model.Equipe
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface EquipeRepository: JpaRepository<Equipe, UUID> {
}