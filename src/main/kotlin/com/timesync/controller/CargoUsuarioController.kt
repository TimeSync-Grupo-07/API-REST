package com.timesync.controller

import com.timesync.model.CargoUsuario
import com.timesync.service.CargoUsuarioService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping
class CargoUsuarioController(
    private val cargoUsuarioService: CargoUsuarioService
) {

    @GetMapping
    fun listarTodos(): List<CargoUsuario> = cargoUsuarioService.listarTodos()

}