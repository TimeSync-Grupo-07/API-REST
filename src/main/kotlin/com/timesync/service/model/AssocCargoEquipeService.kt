package com.timesync.service.model

import com.timesync.DTO.CategoriaValorHoraDTO
import com.timesync.model.AssocCargoEquipe
import com.timesync.repository.model.AssocCargoEquipeRepository
import org.springframework.stereotype.Service

@Service
class AssocCargoEquipeService(
    private val assocCargoEquipeRepository: AssocCargoEquipeRepository
) {

    fun listarTodos(): List<AssocCargoEquipe> = assocCargoEquipeRepository.findAll()

    fun listarCategoriaValorHora(matricula: Int) : List<CategoriaValorHoraDTO> {
        return assocCargoEquipeRepository.buscarCategoriaValorHora(matricula)
    }

}