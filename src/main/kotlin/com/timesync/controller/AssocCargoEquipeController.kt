package com.timesync.controller

import com.timesync.DTO.CategoriaValorHoraDTO
import com.timesync.model.AssocCargoEquipe
import com.timesync.service.AssocCargoEquipeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/AssocCargoEquipe")
class AssocCargoEquipeController (
    private val assocCargoEquipeService: AssocCargoEquipeService
) {

    @GetMapping
    fun listarTodos(): List<AssocCargoEquipe> = assocCargoEquipeService.listarTodos()

    @GetMapping("/CategoriaValorHora/{matricula}")
    fun listarCategoriaValorHora(@PathVariable matricula: Int): List<CategoriaValorHoraDTO> {
        return assocCargoEquipeService.listarCategoriaValorHora(matricula)
    }
}