package com.timesync.service.model

import com.timesync.model.CargoUsuario
import com.timesync.repository.model.CargoUsuarioRepository
import org.springframework.stereotype.Service

@Service
class CargoUsuarioService(
    private val cargoUsuarioRepository: CargoUsuarioRepository
) {

    fun listarTodos(): List<CargoUsuario> = cargoUsuarioRepository.findAll()

}