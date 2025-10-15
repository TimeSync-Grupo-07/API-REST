package com.timesync.repository.views

import com.timesync.views.Vw.VwDistribuicaoEsforco
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface DistribuicaoEsforcoRepository : JpaRepository<VwDistribuicaoEsforco,String> {
    @Query("SELECT d FROM VwDistribuicaoEsforco d WHERE d.idProjeto = :idProjeto")
    fun findByProjetoId(@Param("idProjeto") idProjeto:String): List<VwDistribuicaoEsforco>
}