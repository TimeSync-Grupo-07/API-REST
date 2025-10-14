package com.timesync.repository.model

import com.timesync.model.Apontamentos
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface ApontamentosRepository : JpaRepository<Apontamentos, UUID>{

}