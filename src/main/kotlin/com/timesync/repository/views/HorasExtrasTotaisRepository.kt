package com.timesync.repository.views

import com.timesync.views.VwHorasApontadas
import com.timesync.views.VwHorasExtrasTotais
import com.timesync.views.VwResumoProjetosEquipe
import org.springframework.data.jpa.repository.JpaRepository

interface HorasExtrasTotaisRepository: JpaRepository<VwHorasExtrasTotais, String> {

    fun findByIdProjeto(idProjeto: String): VwHorasExtrasTotais?

}