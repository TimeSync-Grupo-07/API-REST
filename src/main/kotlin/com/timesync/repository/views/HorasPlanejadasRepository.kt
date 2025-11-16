package com.timesync.repository.views

import com.timesync.views.VwHorasPlanejadas
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface HorasPlanejadasRepository : JpaRepository<VwHorasPlanejadas, String> {

    @Query("SELECT h FROM VwHorasPlanejadas h WHERE h.idProjeto = :idProjeto")
    fun findByProjetoId(@Param("idProjeto") idProjeto: String): List<VwHorasPlanejadas>
}