package com.timesync.repository.views

import com.timesync.views.Vw.VwHorasApontadas
import com.timesync.views.Vw.VwResumoProjetosEquipe
import org.springframework.data.jpa.repository.JpaRepository

interface HorasApontadasRepository: JpaRepository<VwHorasApontadas, String> {

    fun findByIdProjeto(idProjeto: String): VwHorasApontadas?

}