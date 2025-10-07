package com.timesync.service

import com.timesync.model.AssocCargoEquipe
import com.timesync.repository.AssocCargoEquipeRepository
import org.springframework.stereotype.Service

@Service
class AssocCargoEquipeService(
    private val assocCargoEquipeRepository: AssocCargoEquipeRepository
) {

    fun listarTodos(): List<AssocCargoEquipe> = assocCargoEquipeRepository.findAll()

}