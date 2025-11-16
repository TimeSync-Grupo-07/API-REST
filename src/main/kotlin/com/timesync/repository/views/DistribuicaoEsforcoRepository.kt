package com.timesync.repository.views

import com.timesync.views.VwDistribuicaoEsforco
import org.hibernate.annotations.processing.SQL
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface DistribuicaoEsforcoRepository : JpaRepository<VwDistribuicaoEsforco,String> {

    fun findByIdProjeto(idProjeto:String): List<VwDistribuicaoEsforco>

    @Query(value = """
        SELECT id_projeto, nome_projeto, matricula, nome_colaborador, 
               horas_planejadas, percentual_esforco
        FROM vw_distribuicao_esforco
        GROUP BY id_projeto, matricula
    """, nativeQuery = true)
    fun findAllGrouped(): List<VwDistribuicaoEsforco>

    @Query("SELECT DISTINCT d FROM VwDistribuicaoEsforco d")
    fun findAllDistinct(): List<VwDistribuicaoEsforco>

}