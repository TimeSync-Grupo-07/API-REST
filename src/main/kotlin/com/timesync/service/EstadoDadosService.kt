package com.timesync.service

import com.timesync.model.EstadoDados
import com.timesync.repository.EstadoDadosRepository
import org.springframework.stereotype.Service

@Service
class EstadoDadosService(
    private val repository: EstadoDadosRepository
) {

    fun listarTodos(): List<EstadoDados> = repository.findAll()
}