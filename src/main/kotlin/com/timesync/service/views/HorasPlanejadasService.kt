package com.timesync.service.views

import com.timesync.repository.views.HorasPlanejadasRepository
import com.timesync.views.Vw.VwHorasPlanejadas
import org.springframework.stereotype.Service

@Service
data class HorasPlanejadasService(
    private val horasPlanejadasRepository: HorasPlanejadasRepository
) {

    fun listarTodas(): List<VwHorasPlanejadas> =
        horasPlanejadasRepository.findAll()

    fun listarPorProjeto(idProjeto: String): List<VwHorasPlanejadas> =
        horasPlanejadasRepository.findByProjetoId(idProjeto)
}