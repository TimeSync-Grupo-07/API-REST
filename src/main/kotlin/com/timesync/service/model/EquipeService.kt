package com.timesync.service.model

import com.timesync.model.Equipe
import com.timesync.repository.model.EquipeRepository
import org.springframework.stereotype.Service

@Service
class EquipeService(
    private val equipeRepository: EquipeRepository
) {

    fun listarTodos(): List<Equipe> = equipeRepository.findAll()

}