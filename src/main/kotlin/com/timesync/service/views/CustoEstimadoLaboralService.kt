package com.timesync.service.views

import com.timesync.repository.views.CustoEstimadoLaboralRepository
import com.timesync.views.Vw.VwCustoEstimadoLaboral
import org.springframework.stereotype.Service

@Service
data class CustoEstimadoLaboralService(
    private val custoEstimadoLaboralRepository: CustoEstimadoLaboralRepository
){
    fun listarTodas(): List<VwCustoEstimadoLaboral> = custoEstimadoLaboralRepository.findAll()

    fun listarPorProjeto(idProjeto:String): List<VwCustoEstimadoLaboral> = custoEstimadoLaboralRepository.findByProjetoId(idProjeto)
}
