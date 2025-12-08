package com.timesync.service.views

import com.timesync.DTO.IndicadoreColaboradorDTO
import com.timesync.repository.views.IndicadoresJornadaRepository
import com.timesync.views.VwIndicadoresJornada
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
data class IndicadoresJornadaService (
    private val indicadoresJornadaRepository: IndicadoresJornadaRepository
) {

    fun listarTodas(): List<VwIndicadoresJornada> = indicadoresJornadaRepository.findAll()

    fun listarPorProjeto (idProjeto:String): List<VwIndicadoresJornada> = indicadoresJornadaRepository.findByProjetoId(idProjeto)

    fun listarPorColaborador(matricula: Int): List<IndicadoreColaboradorDTO>{

        var resposta: List<VwIndicadoresJornada> = indicadoresJornadaRepository.findByMatricula(matricula)

        val listaDTO = resposta.map { item ->
            IndicadoreColaboradorDTO(
                projeto = item.nomeProjeto ?: "",
                horasPlanejadas = item.horasPlanejadas ?: 0,
                horasApontadas = item.horasApontadas ?: 0,
                horasExtras = item.horasExtras ?: 0,
                taxaErroApontamento = item.taxaErroApontamento ?: BigDecimal.ZERO
            )
        }

        return listaDTO

    }
}