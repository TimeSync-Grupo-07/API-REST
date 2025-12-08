package com.timesync.controller.views

import com.timesync.DTO.IndicadoreColaboradorDTO
import com.timesync.service.views.IndicadoresJornadaService
import com.timesync.service.views.InformacoesCalculoService
import com.timesync.views.VwIndicadoresJornada
import com.timesync.views.VwInformacoesCalculo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/InfomacoesCalculo")
class InformacoesCalculoController (
    private val informacoesCalculoService: InformacoesCalculoService
) {

    @GetMapping
    fun listarTodas(): List <VwInformacoesCalculo> = informacoesCalculoService.listarTodos()

    @GetMapping("/{matricula}")
    fun listarPorColaborador(@PathVariable matricula: Int): VwInformacoesCalculo = informacoesCalculoService.listarColaborador(matricula)

}