package com.timesync.repository.views

import com.timesync.views.VwHorasApontadas
import com.timesync.views.VwResumoProjetosEquipe
import org.springframework.data.jpa.repository.JpaRepository

interface HorasApontadasRepository: JpaRepository<VwHorasApontadas, String> {

    fun findByIdProjeto(idProjeto: String): VwHorasApontadas?

}