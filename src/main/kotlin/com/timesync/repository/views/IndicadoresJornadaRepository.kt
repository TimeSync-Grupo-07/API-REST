package com.timesync.repository.views

import com.timesync.views.VwIndicadoresJornada
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface IndicadoresJornadaRepository:JpaRepository <VwIndicadoresJornada,String> {

    @Query("SELECT i FROM VwIndicadoresJornada i WHERE i.idProjeto = :idProjeto")
    fun findByProjetoId(@Param("idProjeto") idProjeto:String): List<VwIndicadoresJornada>

    fun findByMatricula(matricula: Int): List<VwIndicadoresJornada>
}