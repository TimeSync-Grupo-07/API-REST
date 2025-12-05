package com.timesync.controller.views

import com.timesync.service.views.CustoRealLaboralService
import com.timesync.views.VwCustoRealLaboral
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping ("/CustoRealLaboral")
class CustoRealLaboralController (
    private val custoRealLaboralService: CustoRealLaboralService
){
    @GetMapping
    fun listarTodas(): List<VwCustoRealLaboral> = custoRealLaboralService.listarTodas()

    @GetMapping("/{idProjeto}")
    fun listarPorProjeto(@PathVariable idProjeto:String): List<VwCustoRealLaboral> = custoRealLaboralService.listarPorProjeto(idProjeto)

}