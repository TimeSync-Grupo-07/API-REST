package com.timesync.repository.views

import com.timesync.views.VwCustoRealLaboral
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface CustoRealLaboralRepository:JpaRepository<VwCustoRealLaboral,String> {
    @Query("SELECT c FROM VwCustoRealLaboral c WHERE c.idProjeto = :idProjeto")
    fun findByProjetoId(@Param("idProjeto") idProjeto: String): List<VwCustoRealLaboral>
}