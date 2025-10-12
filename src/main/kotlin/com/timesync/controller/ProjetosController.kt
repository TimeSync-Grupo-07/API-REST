package com.timesync.controller

import com.timesync.DTO.ProjetosInfoDTO
import com.timesync.model.Projetos
import com.timesync.service.ProjetosService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/Projetos")
class ProjetosController(
    private val projetosService: ProjetosService
) {

    @GetMapping
    fun listarTodos(): List<Projetos> = projetosService.listarTodos()

    @GetMapping("/listarInfos")
    fun listarProjetosInfo(): List<ProjetosInfoDTO>{
        return projetosService.listarProjetosInfo()
    }

}