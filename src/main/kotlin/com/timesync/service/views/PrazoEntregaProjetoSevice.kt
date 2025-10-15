package com.timesync.service.views

import com.timesync.repository.views.PrazoEntregaProjetoRepository
import com.timesync.views.Vw.VwPrazoEntregaProjeto
import org.springframework.stereotype.Service

@Service
data class PrazoEntregaProjetoSevice (
    private val prazoEntregaProjetosRepository:PrazoEntregaProjetoRepository
) {
    fun listar(): List<VwPrazoEntregaProjeto> =
        prazoEntregaProjetosRepository.findAll()

    fun listarPorProjeto(idProjeto: String): List<VwPrazoEntregaProjeto> =
        prazoEntregaProjetosRepository.findByProjetoId(idProjeto)
}