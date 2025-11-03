package com.timesync.controller.views

import com.timesync.service.views.HorasApontadasService
import com.timesync.views.Vw.VwHorasApontadas
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/HorasApontadas")
class HorasApontadasController(
    private val horasApontadasService: HorasApontadasService
) {

    @GetMapping
    fun listarTodos(): List<VwHorasApontadas> = horasApontadasService.listarTodos()

    @GetMapping("/{idProjeto}")
    fun buscarProjeto(@PathVariable idProjeto: String): VwHorasApontadas? = horasApontadasService.buscarProjeto(idProjeto)

}