package com.timesync.controller

import com.timesync.model.AssocUsuarioProjetos
import com.timesync.service.AssocUsuarioProjetosService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/AssocUsuarioProjetos")
class AssocUsuarioProjetosController (
    private val assocUsuarioProjetosService: AssocUsuarioProjetosService
) {

    @GetMapping
    fun listarTodos(): List<AssocUsuarioProjetos> = assocUsuarioProjetosService.listarTodos()

}