package com.timesync.service.model

import com.timesync.model.EstadoDados
import com.timesync.repository.model.EstadoDadosRepository
import org.springframework.stereotype.Service

@Service
class EstadoDadosService(
    private val estadoDadosrepository: EstadoDadosRepository
) {

    fun listarTodos(): List<EstadoDados> = estadoDadosrepository.findAll()
}