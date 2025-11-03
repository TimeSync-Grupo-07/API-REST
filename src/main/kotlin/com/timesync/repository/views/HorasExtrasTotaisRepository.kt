package com.timesync.repository.views

import com.timesync.views.Vw.VwHorasApontadas
import com.timesync.views.Vw.VwHorasExtrasTotais
import com.timesync.views.Vw.VwResumoProjetosEquipe
import org.springframework.data.jpa.repository.JpaRepository

interface HorasExtrasTotaisRepository: JpaRepository<VwHorasExtrasTotais, String> {

    fun findByIdProjeto(idProjeto: String): VwHorasExtrasTotais?

}