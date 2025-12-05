package com.timesync.repository.views

import com.timesync.views.*
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface CustosCargosEquipeRepository:JpaRepository<VwCustosCargosEquipe, UUID> {

    fun findByCustoHoraTrabalhoIsNotNull(): List<VwCustosCargosEquipe>

}