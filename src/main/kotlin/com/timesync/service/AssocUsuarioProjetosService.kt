package com.timesync.service

import com.timesync.model.AssocUsuarioProjetos
import com.timesync.repository.AssocUsuarioProjetosRepository
import org.springframework.stereotype.Service

@Service
class AssocUsuarioProjetosService(
    private val assocUsuarioProjetosRepository: AssocUsuarioProjetosRepository
) {

    fun listarTodos(): List<AssocUsuarioProjetos> = assocUsuarioProjetosRepository.findAll()

}