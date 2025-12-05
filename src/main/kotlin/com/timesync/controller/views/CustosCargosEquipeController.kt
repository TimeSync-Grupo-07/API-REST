package com.timesync.controller.views

import com.timesync.service.views.CustosCargosEquipeService
import com.timesync.service.views.HorasApontadasService
import com.timesync.views.VwCustosCargosEquipe
import com.timesync.views.VwHorasApontadas
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/CustosCargosEquipe")
class CustosCargosEquipeController(
    private val custosCargosEquipeService: CustosCargosEquipeService
) {

    @GetMapping
    fun listarTodos(): List<VwCustosCargosEquipe> = custosCargosEquipeService.listarTodos()

}