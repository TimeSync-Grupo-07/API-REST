package com.timesync.repository.views

import com.timesync.views.Vw.VwCustoEstimadoLaboral
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface CustoEstimadoLaboralRepository:JpaRepository<VwCustoEstimadoLaboral,String> {
    @Query("SELECT c FROM VwCustoEstimadoLaboral c WHERE c.idProjeto = :idProjeto")
    fun findByProjetoId(@Param("idProjeto") idProjeto: String): List<VwCustoEstimadoLaboral>
}