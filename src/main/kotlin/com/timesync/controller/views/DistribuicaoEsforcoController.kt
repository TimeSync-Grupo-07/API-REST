package com.timesync.controller.views

import com.timesync.service.views.DistribuicaoEsforcoService
import com.timesync.views.Vw.VwDistribuicaoEsforco
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/DistribuicaoEsforco")
class DistribuicaoEsforcoController (
    private val distribuicaoEsforcoService: DistribuicaoEsforcoService
){
    @GetMapping
    fun listarTodas(): List <VwDistribuicaoEsforco> = distribuicaoEsforcoService.listarTodas()

    @GetMapping("/{idProjeto}")
    fun listarPorProjeto(@PathVariable idProjeto: String): List<VwDistribuicaoEsforco> =distribuicaoEsforcoService.listarPorProjeto(idProjeto)

    @GetMapping("/Unicos")
    fun ListarAgrupados(): List<VwDistribuicaoEsforco> = distribuicaoEsforcoService.findAllDistinct()
}