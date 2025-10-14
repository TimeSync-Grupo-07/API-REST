package com.timesync.controller.model

import com.timesync.model.CargoUsuario
import com.timesync.service.model.CargoUsuarioService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/CargoUsuario")
class CargoUsuarioController(
    private val cargoUsuarioService: CargoUsuarioService
) {

    @GetMapping
    fun listarTodos(): List<CargoUsuario> = cargoUsuarioService.listarTodos()

}