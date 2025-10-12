package com.timesync.service

import com.timesync.DTO.ProjetosInfoDTO
import com.timesync.model.Projetos
import com.timesync.repository.ProjetosRepository
import org.springframework.stereotype.Service

@Service
class ProjetosService(
    private val projetosRepository: ProjetosRepository
) {

    fun listarTodos(): List<Projetos> = projetosRepository.findAll()

    fun listarProjetosInfo(): List<ProjetosInfoDTO>{
        return projetosRepository.listarProjetosInfo()
    }

}