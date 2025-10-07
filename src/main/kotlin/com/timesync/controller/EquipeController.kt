package com.timesync.controller

import com.timesync.model.Equipe
import com.timesync.service.EquipeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/Equipe")
class EquipeController(
    private val equipeService: EquipeService
) {

    @GetMapping
    fun listarTodos(): List<Equipe> = equipeService.listarTodos()

}