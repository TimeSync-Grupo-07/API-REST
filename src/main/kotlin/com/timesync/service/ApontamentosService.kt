package com.timesync.service

import com.timesync.model.Apontamentos
import com.timesync.repository.ApontamentosRepository
import org.springframework.stereotype.Service

@Service
class ApontamentosService (
    private val apontamentosRepository: ApontamentosRepository
) {

    fun listarTodos(): List<Apontamentos> = apontamentosRepository.findAll()

}