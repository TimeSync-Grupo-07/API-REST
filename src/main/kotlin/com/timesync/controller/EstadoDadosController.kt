package com.timesync.controller

import com.timesync.model.EstadoDados
import com.timesync.service.EstadoDadosService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/EstadoDados")
class EstadoDadosController (
    private val estadoDadosService: EstadoDadosService
){

    @GetMapping
    fun listarTodos(): List<EstadoDados> = estadoDadosService.listarTodos()

}