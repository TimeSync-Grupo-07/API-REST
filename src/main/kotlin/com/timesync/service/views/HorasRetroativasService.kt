package com.timesync.service.views

import com.timesync.repository.views.HorasRetroativasRepository
import com.timesync.views.Vw.VwHorasRetroativas
import org.springframework.stereotype.Service

@Service
data class HorasRetroativasService(
    private val horasRetroativasRepository: HorasRetroativasRepository
) {

    fun listarTodas(): List<VwHorasRetroativas> =
        horasRetroativasRepository.findAll()

    fun listarPorProjeto(idProjeto: String): VwHorasRetroativas? =
        horasRetroativasRepository.findByIdProjeto(idProjeto)
}