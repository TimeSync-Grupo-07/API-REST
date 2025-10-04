package com.timesync.controller

import com.timesync.model.EstadoDados
import com.timesync.repository.EstadoDadosRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/EstadoDados")
class EstadoDadosController (
    private val repository: EstadoDadosRepository
){

    @GetMapping
    fun listarTodos(): List<EstadoDados> = repository.findAll()

}