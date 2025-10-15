package com.timesync.controller.views

import com.timesync.service.views.HorasPlanejadasService
import com.timesync.views.Vw.VwHorasPlanejadas
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
@RestController
@RequestMapping("/HorasPlanejadas")
class HorasPlanejadasController(
    private val horasPlanejadasService: HorasPlanejadasService
) {

    @GetMapping
    fun listarTodas(): List<VwHorasPlanejadas> =
        horasPlanejadasService.listarTodas()

    @GetMapping("/{idProjeto}")
    fun listarPorProjeto(@PathVariable idProjeto: String): List<VwHorasPlanejadas> =
        horasPlanejadasService.listarPorProjeto(idProjeto)
}