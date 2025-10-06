package com.timesync.controller

import com.timesync.model.Apontamentos
import com.timesync.service.ApontamentosService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/Apontamentos")
class ApontamentosController (
    private val apontamentosService: ApontamentosService
) {

    @GetMapping
    fun listarTodos(): List<Apontamentos> = apontamentosService.listarTodos()

}