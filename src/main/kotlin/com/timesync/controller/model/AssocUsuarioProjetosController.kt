package com.timesync.controller.model

import com.timesync.DTO.DistribuicaoEsforcoDTO
import com.timesync.DTO.IndicadoresJornadaDTO
import com.timesync.model.AssocUsuarioProjetos
import com.timesync.service.model.AssocUsuarioProjetosService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/AssocUsuarioProjetos")
class AssocUsuarioProjetosController (
    private val assocUsuarioProjetosService: AssocUsuarioProjetosService
) {

    @GetMapping
    fun listarTodos(): List<AssocUsuarioProjetos> = assocUsuarioProjetosService.listarTodos()

    @GetMapping("/DistribuicaoEsforco")
    fun buscarDistribuicaoEsforco(): List<DistribuicaoEsforcoDTO> = assocUsuarioProjetosService.buscarDistribuicaoEsforco()

    @GetMapping("/DistribuicaoEsforco/{idProjeto}")
    fun buscarDistribuicaoEsforcoProProjeto(@PathVariable idProjeto: String): List<DistribuicaoEsforcoDTO> = assocUsuarioProjetosService.buscarDistribuicaoEsforcoProProjeto(idProjeto)

    @GetMapping("/IndicadoresJornada")
    fun buscarIndicesJornada(): List<IndicadoresJornadaDTO> = assocUsuarioProjetosService.buscarIndicesJornada()

    @GetMapping("/IndicadoresJornada/{idProjeto}")
    fun buscarIndicesJornada(@PathVariable idProjeto: String): List<IndicadoresJornadaDTO> = assocUsuarioProjetosService.buscarIndicesJornadaPorProjeto(idProjeto)
}