package com.timesync.controller.views

import com.timesync.service.views.PrazoEntregaProjetoSevice
import com.timesync.views.Vw.VwHorasPlanejadas
import com.timesync.views.Vw.VwPrazoEntregaProjeto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/PrazoEntregaProjeto")
class PrazoEntregaProjetoController (
    private val prazoEntregaProjetoService:PrazoEntregaProjetoSevice
) {
    @GetMapping
    fun listar(): List<VwPrazoEntregaProjeto> = prazoEntregaProjetoService.listar()

    @GetMapping("/{idProjeto}")
    fun listarPorProjeto(@PathVariable idProjeto: String): List<VwPrazoEntregaProjeto> =
        prazoEntregaProjetoService.listarPorProjeto(idProjeto)
}