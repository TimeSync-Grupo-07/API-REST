package com.timesync.repository

import com.timesync.model.AssocCargoEquipe
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface AssocCargoEquipeRepository: JpaRepository<AssocCargoEquipe, UUID> {
}