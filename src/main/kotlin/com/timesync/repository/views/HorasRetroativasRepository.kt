package com.timesync.repository.views

import com.timesync.views.Vw.VwHorasRetroativas
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface HorasRetroativasRepository : JpaRepository<VwHorasRetroativas, String> {

    @Query("SELECT h FROM VwHorasRetroativas h WHERE h.idProjeto = :idProjeto")
    fun findByProjetoId(@Param("idProjeto") idProjeto: String): List<VwHorasRetroativas>
}