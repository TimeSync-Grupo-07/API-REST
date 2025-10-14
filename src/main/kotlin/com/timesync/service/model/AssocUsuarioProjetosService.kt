package com.timesync.service.model

import com.timesync.model.AssocUsuarioProjetos
import com.timesync.repository.model.AssocUsuarioProjetosRepository
import org.springframework.stereotype.Service

@Service
class AssocUsuarioProjetosService(
    private val assocUsuarioProjetosRepository: AssocUsuarioProjetosRepository
) {

    fun listarTodos(): List<AssocUsuarioProjetos> = assocUsuarioProjetosRepository.findAll()

}