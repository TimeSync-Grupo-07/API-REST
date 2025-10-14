package com.timesync.repository.model

import com.timesync.model.EstadoDados
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface EstadoDadosRepository: JpaRepository<EstadoDados, UUID> {

}