package com.timesync.controller.views

import com.timesync.service.views.IndicadoresJornadaService
import com.timesync.views.Vw.VwIndicadoresJornada
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/IndicadoresJornada")
class IndicadoresJornadaController (
    private val indicadoresJornadaService: IndicadoresJornadaService
) {
    @GetMapping
    fun listarTodas(): List <VwIndicadoresJornada> = indicadoresJornadaService.listarTodas()

    @GetMapping("/{idProjeto}")
    fun listarPorProjeto(@PathVariable idProjeto:String): List<VwIndicadoresJornada> = indicadoresJornadaService.listarPorProjeto(idProjeto)
}