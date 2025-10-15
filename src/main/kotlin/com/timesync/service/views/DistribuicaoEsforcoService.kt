package com.timesync.service.views

import com.timesync.repository.views.DistribuicaoEsforcoRepository
import com.timesync.views.Vw.VwDistribuicaoEsforco
import org.springframework.stereotype.Service

@Service
data class DistribuicaoEsforcoService(
    private val distribuicaoEsforcoRepository: DistribuicaoEsforcoRepository
) {
    fun listarTodas(): List<VwDistribuicaoEsforco> = distribuicaoEsforcoRepository.findAll()

    fun listarPorProjeto(idProjeto: String): List<VwDistribuicaoEsforco> = distribuicaoEsforcoRepository.findByProjetoId(idProjeto)

}
