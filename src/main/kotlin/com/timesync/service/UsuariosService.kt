package com.timesync.service

import com.timesync.model.Usuarios
import com.timesync.repository.UsuariosRepository
import org.springframework.stereotype.Service

@Service
class UsuariosService (
    private val usuariosRepository: UsuariosRepository
){

    fun listarTodos(): List<Usuarios> = usuariosRepository.findAll()

}