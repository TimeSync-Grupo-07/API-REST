package com.timesync.service.views

import com.timesync.repository.views.HorasApontadasRepository
import com.timesync.views.VwHorasApontadas
import org.springframework.stereotype.Service

@Service
class HorasApontadasService(
    private val horasApontadasRepository: HorasApontadasRepository
) {

    fun listarTodos(): List<VwHorasApontadas> = horasApontadasRepository.findAll()

    fun buscarProjeto(idProjeto: String): VwHorasApontadas? = horasApontadasRepository.findByIdProjeto(idProjeto)

}