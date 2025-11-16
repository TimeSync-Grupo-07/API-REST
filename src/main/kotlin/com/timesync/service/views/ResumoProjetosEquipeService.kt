package com.timesync.service.views

import com.timesync.repository.views.ResumoProjetosEquipeRepository
import com.timesync.views.VwResumoProjetosEquipe
import org.springframework.stereotype.Service

@Service
class ResumoProjetosEquipeService (
    private val resumoProjetosEquipeRepository: ResumoProjetosEquipeRepository
){

    fun listarTodos() : List<VwResumoProjetosEquipe> = resumoProjetosEquipeRepository.findAll()

    fun buscarProjeto(idProjeto: String): VwResumoProjetosEquipe? = resumoProjetosEquipeRepository.findByIdProjeto(idProjeto)

}