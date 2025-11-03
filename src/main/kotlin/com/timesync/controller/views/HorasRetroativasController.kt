package com.timesync.controller.views

import com.timesync.service.views.HorasRetroativasService
import com.timesync.views.Vw.VwHorasRetroativas
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/HorasRetroativas")
class HorasRetroativasController(
    private val horasRetroativasService: HorasRetroativasService
) {

    @GetMapping
    fun listarTodas(): List<VwHorasRetroativas> =
        horasRetroativasService.listarTodas()

    @GetMapping("/{idProjeto}")
    fun listarPorProjeto(@PathVariable idProjeto: String): VwHorasRetroativas? =
        horasRetroativasService.listarPorProjeto(idProjeto)
}