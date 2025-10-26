package com.timesync.service.model

import com.timesync.model.Usuarios
import com.timesync.repository.model.UsuariosRepository
import org.springframework.stereotype.Service

@Service
class UsuariosService (
    private val usuariosRepository: UsuariosRepository
){

    fun listarTodos(): List<Usuarios> = usuariosRepository.findAll()

    fun InsercaoColaborador(){

        usuariosRepository.save<Usuarios>()

    }

}