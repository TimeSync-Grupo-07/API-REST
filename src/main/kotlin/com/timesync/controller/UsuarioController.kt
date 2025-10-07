package com.timesync.controller

import com.timesync.model.Usuarios
import com.timesync.service.UsuariosService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/Usuarios")
class UsuarioController(
    private val usuariosService: UsuariosService
) {

    @GetMapping
    fun listarTodos(): List<Usuarios> = usuariosService.listarTodos()

}