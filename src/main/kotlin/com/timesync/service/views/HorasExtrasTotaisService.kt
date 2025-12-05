package com.timesync.service.views

import com.timesync.repository.views.HorasApontadasRepository
import com.timesync.repository.views.HorasExtrasTotaisRepository
import com.timesync.views.VwHorasApontadas
import com.timesync.views.VwHorasExtrasTotais
import org.springframework.stereotype.Service

@Service
class HorasExtrasTotaisService(
    private val horasExtrasTotaisRepository: HorasExtrasTotaisRepository
) {

    fun listarTodos(): List<VwHorasExtrasTotais> = horasExtrasTotaisRepository.findAll()

    fun buscarProjeto(idProjeto: String): VwHorasExtrasTotais? = horasExtrasTotaisRepository.findByIdProjeto(idProjeto)

}