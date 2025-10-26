package com.timesync.repository.views

import com.timesync.views.Vw.VwResumoProjetosEquipe
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ResumoProjetosEquipeRepository: JpaRepository<VwResumoProjetosEquipe, String> {

    fun findByIdProjeto(idProjeto: String): VwResumoProjetosEquipe?
}