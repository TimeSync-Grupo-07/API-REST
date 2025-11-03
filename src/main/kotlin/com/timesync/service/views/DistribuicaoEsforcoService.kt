package com.timesync.service.views

import com.timesync.repository.views.DistribuicaoEsforcoRepository
import com.timesync.views.Vw.VwDistribuicaoEsforco
import org.springframework.stereotype.Service

@Service
data class DistribuicaoEsforcoService(
    private val distribuicaoEsforcoRepository: DistribuicaoEsforcoRepository
) {
    fun listarTodas(): List<VwDistribuicaoEsforco> = distribuicaoEsforcoRepository.findAllDistinct()

    fun listarPorProjeto(idProjeto: String): List<VwDistribuicaoEsforco> = distribuicaoEsforcoRepository.findByIdProjeto(idProjeto)

    fun findAllDistinct(): List<VwDistribuicaoEsforco> {
        return distribuicaoEsforcoRepository.findAll()
            .groupBy { "${it.idProjeto}-${it.matricula}" }
            .map { it.value.first() }
    }

    fun findAllUnique(): List<VwDistribuicaoEsforco> {
        return distribuicaoEsforcoRepository.findAll().toSet().toList()
    }

}
