package com.timesync.repository.views

import com.timesync.views.Vw.VwPrazoEntregaProjeto
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface PrazoEntregaProjetoRepository:JpaRepository<VwPrazoEntregaProjeto,String>
{
    @Query("SELECT p FROM VwPrazoEntregaProjeto p WHERE p.idProjeto = :idProjeto")
    fun findByProjetoId(@Param("idProjeto")idProjeto: String):List<VwPrazoEntregaProjeto>
}