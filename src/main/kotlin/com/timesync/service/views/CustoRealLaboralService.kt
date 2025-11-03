package com.timesync.service.views

import com.timesync.repository.views.CustoRealLaboralRepository
import com.timesync.views.Vw.VwCustoRealLaboral
import org.springframework.stereotype.Service

@Service
data class CustoRealLaboralService(
    private val custoRealLaboralRepository: CustoRealLaboralRepository
){
    fun listarTodas():List<VwCustoRealLaboral> = custoRealLaboralRepository.findAll()

    fun listarPorProjeto(idProjeto:String): List<VwCustoRealLaboral> = custoRealLaboralRepository.findByProjetoId(idProjeto)
}
