package com.timesync.repository.views

import com.timesync.views.Vw.VwHorasRetroativas
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface HorasRetroativasRepository : JpaRepository<VwHorasRetroativas, String> {

    fun findByIdProjeto(@Param("idProjeto") idProjeto: String): VwHorasRetroativas?
}