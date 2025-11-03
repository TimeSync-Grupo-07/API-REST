package com.timesync.controller.views

import com.timesync.service.views.HorasExtrasTotaisService
import com.timesync.views.Vw.VwHorasExtrasTotais
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/HorasExtrasTotais")
class HorasExtrasTotaisController(
    private val horasExtrasTotaisService: HorasExtrasTotaisService
) {

    @GetMapping
    fun listarTodos(): List<VwHorasExtrasTotais> = horasExtrasTotaisService.listarTodos()

    @GetMapping("/{idProjeto}")
    fun buscarProjeto(@PathVariable idProjeto: String): VwHorasExtrasTotais? = horasExtrasTotaisService.buscarProjeto(idProjeto)

}