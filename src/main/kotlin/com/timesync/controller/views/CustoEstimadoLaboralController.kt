package com.timesync.controller.views

import com.timesync.service.views.CustoEstimadoLaboralService
import com.timesync.views.VwCustoEstimadoLaboral
import com.timesync.views.VwCustoRealLaboral
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping ("/CustoEstimadoLaboral")
class CustoEstimadoLaboralController (
    private val custoEstimadoLaboralService: CustoEstimadoLaboralService
){
    @GetMapping
    fun listarTodas(): List<VwCustoEstimadoLaboral> = custoEstimadoLaboralService.listarTodas()

    @GetMapping("/{idProjeto}")
    fun listarPorProjeto(@PathVariable idProjeto:String): List<VwCustoEstimadoLaboral> = custoEstimadoLaboralService.listarPorProjeto(idProjeto)

}