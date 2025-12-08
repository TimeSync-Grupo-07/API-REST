package com.timesync.service.views

import com.timesync.DTO.IndicadoreColaboradorDTO
import com.timesync.repository.views.IndicadoresJornadaRepository
import com.timesync.repository.views.InformacoesCalculoRepository
import com.timesync.views.VwIndicadoresJornada
import com.timesync.views.VwInformacoesCalculo
import org.springframework.stereotype.Service

@Service
data class InformacoesCalculoService (
    private val informacoesCalculoRepository: InformacoesCalculoRepository
) {

    fun listarTodos(): List<VwInformacoesCalculo> = informacoesCalculoRepository.findAll()

    fun listarColaborador(matricula: Int): VwInformacoesCalculo = informacoesCalculoRepository.findByMatricula(matricula)

}