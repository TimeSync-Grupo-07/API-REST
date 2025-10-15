package com.timesync.controller.views

import com.timesync.service.views.ResumoProjetosEquipeService
import com.timesync.views.Vw.VwResumoProjetosEquipe
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/ResumoProjetosEquipe")
class ResumoProjetosEquipeController(
    private val resumoProjetosEquipeService: ResumoProjetosEquipeService
) {

    @GetMapping
    fun listarTodos() : List<VwResumoProjetosEquipe> = resumoProjetosEquipeService.listarTodos()

}