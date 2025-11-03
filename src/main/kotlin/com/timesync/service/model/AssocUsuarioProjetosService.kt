package com.timesync.service.model

import com.timesync.DTO.DistribuicaoEsforcoDTO
import com.timesync.DTO.IndicadoresJornadaDTO
import com.timesync.model.AssocUsuarioProjetos
import com.timesync.repository.model.AssocUsuarioProjetosRepository
import org.springframework.stereotype.Service

@Service
class AssocUsuarioProjetosService(
    private val assocUsuarioProjetosRepository: AssocUsuarioProjetosRepository
) {

    fun listarTodos(): List<AssocUsuarioProjetos> = assocUsuarioProjetosRepository.findAll()

    fun buscarDistribuicaoEsforco(): List<DistribuicaoEsforcoDTO> = assocUsuarioProjetosRepository.buscarDistribuicaoEsforco()

    fun buscarDistribuicaoEsforcoProProjeto(idProjeto: String): List<DistribuicaoEsforcoDTO> = assocUsuarioProjetosRepository.buscarDistribuicaoEsforcoPorProjeto(idProjeto)

    fun buscarIndicesJornada(): List<IndicadoresJornadaDTO> = assocUsuarioProjetosRepository.buscarIndicesJornada()

    fun buscarIndicesJornadaPorProjeto(idProjeto: String): List<IndicadoresJornadaDTO> = assocUsuarioProjetosRepository.buscarIndicesJornadaPorProjeto(idProjeto)
}