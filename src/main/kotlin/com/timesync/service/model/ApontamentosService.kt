package com.timesync.service.model

import com.timesync.model.Apontamentos
import com.timesync.repository.model.ApontamentosRepository
import org.springframework.stereotype.Service

@Service
class ApontamentosService (
    private val apontamentosRepository: ApontamentosRepository
) {

    fun listarTodos(): List<Apontamentos> = apontamentosRepository.findAll()

}