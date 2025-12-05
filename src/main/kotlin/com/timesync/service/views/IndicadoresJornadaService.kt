package com.timesync.service.views

import com.timesync.repository.views.IndicadoresJornadaRepository
import com.timesync.views.VwIndicadoresJornada
import org.springframework.stereotype.Service

@Service
data class IndicadoresJornadaService (
    private val indicadoresJornadaRepository: IndicadoresJornadaRepository
) {

    fun listarTodas(): List<VwIndicadoresJornada> = indicadoresJornadaRepository.findAll()

    fun listarPorProjeto (idProjeto:String): List<VwIndicadoresJornada> = indicadoresJornadaRepository.findByProjetoId(idProjeto)
}